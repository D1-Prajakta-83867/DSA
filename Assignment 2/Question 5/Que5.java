
	public class Que5 {
	    private int SIZE;       
	    private int top;        
	    private int[] stack;    

	    public Que5(int size) {
	        SIZE = size;
	        top = SIZE;        
	        stack = new int[SIZE];
	    }

	    public void push(int element) {
	        if (top > 0) {
	            top--;
	            stack[top] = element;
	            System.out.println("Pushed element: " + element);
	        } else {
	            System.out.println("Stack Overflow: Cannot push element " + element + ". Stack is full.");
	        }
	    }

	    public int pop() {
	        if (top == SIZE) {
	            System.out.println(" Cannot pop from empty stack.");
	            return -1;  
	            // Return -1 to indicate stack underflow
	        } else {
	            int poppedElement = stack[top];
	            top++;
	            return poppedElement;
	        }
	    }

	    public boolean isEmpty() {
	        return top == SIZE;
	    }

	    public boolean isFull() {
	        return top == 0;
	    }

	    public void printStack() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.print("Stack (top to bottom): ");
	            for (int i = top; i < SIZE; i++) {
	                System.out.print(stack[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	    	Que5 stack = new Que5(5);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        stack.printStack();

	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());

	        stack.printStack();

	        stack.push(40);
	        stack.push(50);
	        stack.push(60);
	        stack.push(70);

	        stack.printStack();
	    }
	}


