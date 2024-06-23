package com.sunbeam;

public class Main {
    public static void main(String[] args) {
        // Testing stack
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Testing queue
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("\nQueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
