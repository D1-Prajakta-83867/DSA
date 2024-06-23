package com.sunbeam;

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element onto the stack
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = top;
        top = newNode;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow - Cannot pop from an empty stack");
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - No element to peek");
        }
        return top.data;
    }
}
