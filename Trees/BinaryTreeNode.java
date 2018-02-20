
public class BinaryTreeNode {
	public int data;
	public BinaryTreeNode left, right;

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int value) {
		this.data = value;
	}
}
