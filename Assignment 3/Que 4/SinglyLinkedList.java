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

    public void insertSorted(int newData) {
        Node newNode = new Node(newData);

        if (head == null || newData < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < newData) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertSorted(3);
        list.insertSorted(1);
        list.insertSorted(4);
        list.insertSorted(2);
        list.insertSorted(5);

        System.out.println("Sorted list:");
        list.displayList();
    }
}
