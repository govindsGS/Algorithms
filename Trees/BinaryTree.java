import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BinaryTreeNode root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public BinaryTreeNode getRoot() {
		return root;
	}
	
	public BinaryTreeNode insertInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
		if (root == null)
			return new BinaryTreeNode(data);
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTreeNode temp = queue.remove();
			if (temp!= null){
				if (temp.left != null){
					queue.add(temp.left);
				}
				else{
					temp.left = new BinaryTreeNode(data);
					return root;
				}
			}
			if (temp.right != null){
				queue.add(temp.right);
			}
			else{
				temp.right= new BinaryTreeNode(data);
				return root;
			}
		}
		return root;
	}
	
	public void preOrderTraversal(BinaryTreeNode root){
		if (root != null){
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void inOrderTraversal(BinaryTreeNode root){
		if (root != null){
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(BinaryTreeNode root){
		if (root != null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
		}	
	}
}
