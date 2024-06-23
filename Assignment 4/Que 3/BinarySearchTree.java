
class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int newData) {
        root = insertRecursive(root, newData);
    }

    private Node insertRecursive(Node current, int newData) {
        if (current == null) {
            return new Node(newData);
        }

        if (newData < current.data) {
            current.left = insertRecursive(current.left, newData);
        } else if (newData > current.data) {
            current.right = insertRecursive(current.right, newData);
        }

        // Return the unchanged node pointer
        return current;
    }

    public void inorderTraversal() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node node) {
        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.data + " ");
            inorderRecursive(node.right);
        }
    }
}
