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
public class LowestCommnAncestor {
	Node root;
	LowestCommnAncestor(int item)
	{
		root = new Node(item);
	}
	LowestCommnAncestor() {}
	
	public static void main(String[] args)
	{
		LowestCommnAncestor tree = new LowestCommnAncestor();
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(2);
		/*
		tree.root.left.left.left = null;
		tree.root.left.left.right = new Node(10);
		tree.root.left.left.right.left = new Node(7);
		tree.root.left.left.right.right = new Node(4);
		*/
		tree.root.right.left = new Node(0);
		tree.root.right.right = new Node(8);
		levelOrderTraverse(tree.root);
		Node p = tree.root.right.left;
		Node q = tree.root.right.right;
		Node LCA = lowestCommonAncestor(tree.root,p,q);
		System.out.println("LCA ="+LCA.data);
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
	public static Node lowestCommonAncestor(Node root, Node p, Node q) {
		if(root==null || root == p || root==q){
			return root;
		}
		Node left = lowestCommonAncestor(root.left, p,q);
		Node right = lowestCommonAncestor(root.right, p, q);
		if(left!=null && right!=null)
			return root;
		if(left!=null)
			return left;
		else
			return right;
		
	}

}
