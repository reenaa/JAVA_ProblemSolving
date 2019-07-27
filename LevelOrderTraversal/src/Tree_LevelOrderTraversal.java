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
public class Tree_LevelOrderTraversal {
	Node root;
	Tree_LevelOrderTraversal(int item)
	{
		root = new Node(item);
	}
	Tree_LevelOrderTraversal() {}
	
	public static void main(String[] args)
	{
		Tree_LevelOrderTraversal tree = new Tree_LevelOrderTraversal();
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		tree.root.left.left.left = null;
		tree.root.left.left.right = new Node(10);
		tree.root.left.left.right.left = new Node(7);
		tree.root.left.left.right.right = new Node(4);
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		levelOrderTraverse(tree.root);
	}
	public static void levelOrderTraverse(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node tempNode = queue.poll();
			System.out.print(tempNode.data+", ");
			if(tempNode.left!=null){
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null){
				queue.add(tempNode.right);
			}
				
		}
	}
	
}
