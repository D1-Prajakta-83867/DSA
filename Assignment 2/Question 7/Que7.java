public class Que7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(array);

        reverseArrayUsingStack(array);

        System.out.println("\nReversed Array:");
        printArray(array);
    }

    
    public static void reverseArrayUsingStack(int[] array) {
        Stack stack = new Stack();

        
        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static class Stack {
        private Node top;

        public Stack() {
            this.top = null;
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
               System.out.print("Stack is empty.");
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.print("Stack is empty.");
            }
            return top.data;
        }

        private static class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    }
}
