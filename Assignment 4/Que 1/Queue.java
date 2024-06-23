package com.sunbeam;

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to add an element to the queue (enqueue operation)
    public void enqueue(int newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to remove an element from the queue (dequeue operation)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow - Cannot dequeue from an empty queue");
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedValue;
    }

    // Method to peek the front element of the queue
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty - No element to peek");
        }
        return front.data;
    }
}
