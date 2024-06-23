
public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque();

        // Adding elements at the front
        deque.addFront(1);
        deque.addFront(2);
        deque.addFront(3);

        // Adding elements at the rear
        deque.addRear(4);
        deque.addRear(5);

        // Displaying elements from front to rear
        System.out.println("Deque elements from front to rear:");
        while (!deque.isEmpty()) {
            System.out.println(deque.removeFront());
        }

        // Adding elements again for testing from rear to front
        deque.addFront(3);
        deque.addFront(2);
        deque.addFront(1);
        deque.addRear(4);
        deque.addRear(5);

        // Displaying elements from rear to front
        System.out.println("\nDeque elements from rear to front:");
        while (!deque.isEmpty()) {
            System.out.println(deque.removeRear());
        }
    }
}
