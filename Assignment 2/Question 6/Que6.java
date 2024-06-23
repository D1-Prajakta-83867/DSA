import java.util.Stack;

public class Que6 {
    private Stack<Integer> stack;
    private int maxElement;

    public Que6() {
        stack = new Stack<>();
        maxElement = Integer.MIN_VALUE; 
    }

    public void push(int element) {
        if (element > maxElement) {
            stack.push(maxElement); 
            maxElement = element;   
        }
        stack.push(element);      
    }

    public int pop() {
        int poppedElement = stack.pop();
        if (poppedElement == maxElement) {
            maxElement = stack.pop(); 
        }
        return poppedElement;
    }

    public int getMax() {
        return maxElement;
    }

    public static void main(String[] args) {
    	Que6 maxStack = new Que6();

        maxStack.push(3);
        maxStack.push(10);
        maxStack.push(5);
        maxStack.push(8);
        maxStack.push(2);
        maxStack.push(20);
        System.out.println("Maximum element in the stack: " + maxStack.getMax());

        maxStack.pop();
        maxStack.pop();

        System.out.println("Maximum element in the stack after popping: " + maxStack.getMax());
    }
}
