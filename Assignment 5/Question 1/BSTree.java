
public class BSTree {
static class Node{
	private int data;
	private Node left;
	private Node right;
	public Node(int value) {
		data =  value;
		left = right = null;
		
	}
}
private Node root;
public BSTree() {
	root = null;
}
public boolean isEmpty() {
	return root == null;
}

public void addNode(int value) {
	if(isEmpty())
		root = new Node(value);
	else
		addNode(root, value);
}
public void addNode(Node trav,int value) {
	if(value < trav.data) {
		if(trav.left == null) {
			trav.left = new Node(value);
		   return;
		}
		else
			addNode(trav.left,value);	
	}
	else {
		if(trav.right == null) {
			trav.right = new Node(value);
			return;
			
		}
		else
			addNode(trav.right,value);
	}
		
}

public void inorder(Node trav) {
	if(trav == null)
		return;
	inorder(trav.left);	// L
	System.out.print(" " + trav.data);	// V
	inorder(trav.right);	// R
}

public void inorder() {
	System.out.print("Inorder : ");
	inorder(root);
	System.out.println("");
}

	
	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.addNode(6);
		bst.addNode(12);
		bst.addNode(18);
		bst.addNode(2);
		bst.inorder();
	}

}
