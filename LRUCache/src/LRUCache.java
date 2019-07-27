import java.util.HashMap;
class Node{
	int key;
	int value;
	Node next;
	Node pre;
	
	public Node(int key, int value){
		this.key = key;
		this.value = value;
		this.next = null;
		this.pre = null;
	}
}
public class LRUCache {
	private int capacity;
	private HashMap<Integer, Node> map = new HashMap<>();
	private Node head = null;
	private Node end = null;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}
	public int get(int key){
		if(map.containsKey(key)){
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}
	public void setHead(Node n){
		if(head!=null){
			n.next = head;
			head.pre = n;
			n.pre = null;
		}
	}
	public void remove(Node n){
		if(n.pre!=null){
			n.pre.next = n.next;
		}
		else{
			head = n.next;
		}
		if(n.next!=null){
			n.next.pre = n.pre;
		}
		else{
			end = n.pre;
		}
		n.pre = null;
		n.next = null;
	}
	public void put(int key, int value){
		if(map.containsKey(key)){
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		}else{
			if(map.size() >= this.capacity){
				map.remove(end.key);
				remove(end);
			}
			
		}
		Node newNode = new Node(key,value);
		map.put(key, newNode);
		setHead(newNode);
		System.out.println("key="+key+" value="+newNode.value);
		
	}
	public static void main(String[] args){
		LRUCache cache = new LRUCache( 2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		/*
		cache.get(1);       // returns 1
		cache.put(3, 3);    // evicts key 2
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		cache.get(4);       // returns 4
		*/
	}
}
