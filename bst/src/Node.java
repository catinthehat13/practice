package trees;

public class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}

	public void setLeft(Node n) { 
		this.left = n;
	}
	
	public void setRight(Node n) {
		this.right = n;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public int getData() {
		return this.data;
	}
  
}
