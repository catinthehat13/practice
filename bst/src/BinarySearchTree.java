package trees;

import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
	
	public BinarySearchTree() {
	}
	
	public Node insert(int d, Node n) {
		if (n == null) {
			n = new Node(d);
			return n;
		}
		
		if (d < n.getData()) {
			Node newLeft = this.insert(d, n.getLeft());
			n.setLeft(newLeft);
		}
		else {
			Node newRight = this.insert(d, n.getRight());
			n.setRight(newRight);
		}
		
		return n;
	}
	
	public Node delete(int d, Node n) {
		// Assumptions: all values are unique
		
		if (d == n.getData()) {
			n = null;
			return n;
		}
		
		if (d < n.getData()) {
			Node newLeft = this.delete(d, n.getLeft());
			n.setLeft(newLeft);
		}
		else {
			Node newRight = this.delete(d, n.getRight());
			n.setRight(newRight);
		}
		
		return n;
	}
	
	// Left rotation of a binary tree.
	public Node rotateLeft(Node n) {
		// TODO
		return null;
	}

	// Right rotation of a binary tree.
	public Node rotateRight(Node n) {
		// TODO
		return null;
	}

	public void printTree(Node n) {
		if (n == null) {
			return;
		}
		
		Queue q = new LinkedList();	
		q.add(n);
		q.add(new Node(-1));
		
		while (!q.isEmpty()) {
			Node curr = (Node) q.remove();
			
			if (curr.getData() == -1) {
				System.out.println("");
			}
			else {
				System.out.print(curr.getData() + " ");
			}
			
			if(curr.getLeft() != null) {
				q.add(curr.getLeft());
			}
			
			if (curr.getRight() != null) {
				q.add(curr.getRight());
			}
			
			if (curr.getLeft() != null || curr.getRight() != null) {
				q.add(new Node(-1));
			}
		}
	}
}
