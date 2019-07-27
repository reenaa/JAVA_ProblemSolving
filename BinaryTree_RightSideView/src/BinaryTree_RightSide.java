import java.util.*;
class Node{
	Node left;
	Node right;
	int data;
	public Node(int x)
	{
		this.data = x;
		left = null;
		right = null;
	}
}
public class BinaryTree_RightSide {
	Node root;
	public BinaryTree_RightSide()
	{
		root = null;
	}
	public BinaryTree_RightSide(int x)
	{
		root = new Node(x);
	}

	public static void main(String[] args)
	{
		BinaryTree_RightSide tree = new BinaryTree_RightSide();
		
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		tree.root.left.left.left = null;
		tree.root.left.left.right = new Node(12);
		tree.root.left.left.right.left = new Node(7);
		tree.root.left.left.right.right = new Node(4);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		tree.printInOrder(tree.root);
		System.out.println("");
		List<Integer> lst = tree.rightsideview(tree.root);
		System.out.println("Right side view:");
		System.out.print(lst);
		
	}
	public void printInOrder(Node root)
	{
		if(root.left!=null){
			printInOrder(root.left);
		}
		System.out.print(root.data+", ");
		if(root.right!=null){
			printInOrder(root.right);
		}
	}
	List<Integer> rightsideview(Node root){
		Map<Integer,Integer> rightmostValueAtDepth = new HashMap<Integer,Integer>();
		Queue<Node> nodeQueue = new LinkedList<Node>();
		Queue<Integer> depthQueue = new LinkedList<Integer>();
		int max_depth = 0;
		nodeQueue.add(root);
		depthQueue.add(0);
		while(!nodeQueue.isEmpty()){
			Node node = nodeQueue.remove();
			int depth = depthQueue.remove();
			if(node!=null){
				max_depth = Math.max(max_depth, depth);
				rightmostValueAtDepth.put(depth, node.data);
				nodeQueue.add(node.left);
				nodeQueue.add(node.right);
				depthQueue.add(depth+1);
				depthQueue.add(depth+1);
			}
		}
		List<Integer> rightview = new ArrayList<Integer>();
		for(int depth = 0;depth<=max_depth; depth++){
			rightview.add(rightmostValueAtDepth.get(depth));
		}
		return rightview;
	}
	
	
}


