import java.util.Scanner;

public class BSTreeQ2 {

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
public BSTreeQ2() {
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
boolean search(int key) {
    return search(root, key);
}


boolean search(Node trav,int key) {
	if(trav == null || trav.data == key)
		return trav != null;
	if(key > trav.data)
		return search(trav.right,key);
	
	 return search(trav.left,key);
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
		BSTreeQ2 bst = new BSTreeQ2();
		bst.addNode(6);
		bst.addNode(12);
		bst.addNode(18);
		bst.addNode(2);
		bst.addNode(24);
		bst.inorder();
		
	//	bst.search1(12);
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.print("Enter key to search:");
		key = sc.nextInt();
		if(bst.search(key))
			System.out.print("key "+key+" found in BST !!!");
		else
			System.out.print(key+" not found in BST");

	}
}
