
public class TreeTravesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		BinaryTreeNode root = binaryTree.getRoot();
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 1);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 2);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 3);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 4);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 5);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 6);
		root = binaryTree.insertInBinaryTreeLevelOrder(root, 7);
		
		System.out.print("Pre Order Traversal :: ");
		binaryTree.preOrderTraversal(root);
		System.out.print("\nIn Order Traversal :: ");
		binaryTree.inOrderTraversal(root);
		System.out.print("\nPost Order Traversal :: ");
		binaryTree.postOrderTraversal(root);
	}

}
