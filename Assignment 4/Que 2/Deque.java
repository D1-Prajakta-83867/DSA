
class Deque {
    private Node front;
    private Node rear;

    public Deque() {
        this.front = null;
        this.rear = null;
    }

    // Method to check if the deque is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to add an element at the front of the deque
    public void addFront(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Method to add an element at the rear of the deque
    public void addRear(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to remove an element from the front of the deque
    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque underflow - Cannot remove from an empty deque");
        }
        int removedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        return removedValue;
    }

    // Method to remove an element from the rear of the deque
    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque underflow - Cannot remove from an empty deque");
        }
        int removedValue = rear.data;
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        return removedValue;
    }

    // Method to peek the front element of the deque
    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty - No element to peek");
        }
        return front.data;
    }

    // Method to peek the rear element of the deque
    public int peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty - No element to peek");
        }
        return rear.data;
    }
}
