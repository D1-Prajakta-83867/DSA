
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }


    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }


    public void insertBefore(Node nextNode, int newData) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == nextNode) {
            // If the nextNode is the head itself, insert before the head
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.next != nextNode) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Given node is not found in the list.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to display the linked list
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to insert a node at the beginning of the linked list
    public void insertFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at the end of the linked list
    public void insertLast(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);

        System.out.println("Original list:");
        list.displayList();

        // Insert after node with data 2
        Node node2 = list.head.next;
        list.insertAfter(node2, 3);
        System.out.println("List after inserting 3 after node with data 2:");
        list.displayList();

        // Insert before node with data 4
        Node node4 = list.head.next.next.next;
        list.insertBefore(node4, 5);
        System.out.println("List after inserting 5 before node with data 4:");
        list.displayList();
    }
}
