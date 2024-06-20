import java.util.Scanner;

public class BSTreeQ3 {

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
public BSTreeQ3() {
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
public void deleteNode(int key) {
	//1. search node with its parents
	Node arr[] = binarySearchWithParent(key);
	Node temp = arr[0], parent = arr[1];
	//2. if node is not found
	if(temp == null)
		return;
	//3. if node has 2 child
	if(temp.left != null && temp.right != null){
		//1. find predecessor of temp.data
		//Node pred = temp.left;
		Node pred = temp.right;
		
		parent = temp;
		//while(pred.right != null){
		while(pred.left != null){
			parent = pred;
			//pred = pred.right;
			pred = pred.left;
		}
		//2. replace temp's data by predecessor's data
		temp.data = pred.data;
		//3. delete predecessor
		temp = pred;
	}
	//4. if node has single child (right child)
	if(temp.left == null){
		if(temp == root)
			root = temp.right;
		else if(temp == parent.left)
			parent.left = temp.right;
		else if(temp == parent.right)
			parent.right = temp.right;
	}
	//5. if node has single child (left child)		
	else {//if(temp.right == null){
		if(temp == root)
			root = temp.left;
		else if(temp == parent.left)
			parent.left = temp.left;
		else if(temp == parent.right)
			parent.right = temp.left;
	}
}
public Node[] binarySearchWithParent(int key) {
	//1. start from root
	Node trav = root;
	Node parent = null;
	while(trav != null) {
		//2. if key is equal to current data
		if(key == trav.data)
			break;
		parent = trav;
		//3. if key is less than current data
		if(key < trav.data)
			// search key into left of current node
			trav = trav.left;
		//4. if key is greater than current data
		else
			// search key into right of current node
			trav = trav.right;
	}//5. repeat step 2 to 4 till leaf nodes
	if(trav == null)
		parent = null;
	//6. key is not found
	return new Node[]{trav, parent};
}


	
	public static void main(String[] args) {
		BSTreeQ3 bst = new BSTreeQ3();
		bst.addNode(6);
		bst.addNode(12);
		bst.addNode(18);
		bst.addNode(2);
		bst.inorder();
		
	//	bst.search1(12);
		Scanner sc = new Scanner(System.in);
		int nodeToDele;
		System.out.print("Enter key to delete:");
		nodeToDele = sc.nextInt();
		bst.deleteNode(nodeToDele);
			System.out.print("After deletion of node :");
			bst.inorder();
			
	}
}
