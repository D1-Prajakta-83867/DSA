
public class Que8 {

	    private int[] queue;
	    private int front;  
	    private int rear;   
	    private int size;  
	    private int capacity;

	    public Que8(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = -1;
	        rear = -1;
	        size = 0;
	    }

	    public void enqueue(int element) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + element);
	            return;
	        }

	        rear = (rear + 1) % capacity;
	        queue[rear] = element;
	        size++;

	        if (front == -1) {
	            front = rear; 
	        }
	        System.out.println("Enqueued element: " + element);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }

	        int removedElement = queue[front];
	        queue[front] = 0; 
	        size--;

	        if (front == rear) {
	            front = -1;
	            rear = -1;
	        } else {
	            front = (front + 1) % capacity;
	        }

	        return removedElement;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        System.out.print("Queue elements: ");
	        int count = 0;
	        int index = front;
	        while (count < size) {
	            System.out.print(queue[index] + " ");
	            index = (index + 1) % capacity;
	            count++;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Que8 queue = new Que8(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        queue.display();

	        System.out.println("Dequeued element: " + queue.dequeue());
	        System.out.println("Dequeued element: " + queue.dequeue());

	        queue.enqueue(60);
	        queue.enqueue(70);

	        queue.display();
	    }
	}


