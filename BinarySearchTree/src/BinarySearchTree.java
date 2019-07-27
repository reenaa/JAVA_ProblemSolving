class Node
	{
		Node left,right;
		int data;
		Node(int x){
			this.data = x;
		}
		public void insert(int value)
		{
			if(value <= data){
				if(left==null){
					left = new Node(value);
				}
				else{
					left.insert(value);
				}
			}else{
				if(right==null){
					right = new Node(value);
				}else{
					right.insert(value);
				}
			}
		}
		public void printInorder()
		{
			if(left!=null){
				left.printInorder();
			}
			System.out.print(data+",");
			if(right!=null){
				right.printInorder();
			}
		}
	}
public class BinarySearchTree {
	
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.insert(7);
		root.insert(30);
		root.insert(9);
		root.insert(2);
		root.insert(20);
		
		root.printInorder();
	}
}
