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
public class ClsBinaryTree {
	Node root;
	public ClsBinaryTree()
	{
		root = null;
	}
	public ClsBinaryTree(int x)
	{
		root = new Node(x);
	}
	
	public static void main(String[] args)
	{
		ClsBinaryTree tree = new ClsBinaryTree();
		
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		tree.root.left.left.left = null;
		tree.root.left.left.right = new Node(2);
		tree.root.left.left.right.left = new Node(7);
		tree.root.left.left.right.right = new Node(4);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		tree.printInOrder(tree.root);
		
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
}
