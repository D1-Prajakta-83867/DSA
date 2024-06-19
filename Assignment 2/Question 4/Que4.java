
public class Que4 {
 private int arr[];
 private int front,rear;
 private final int SIZE;
 public Que4(int size) {
	 SIZE = size;
	 arr = new int[SIZE];
	 front = rear = 0; 
 }
 
 public void push(int value) {
	 arr[rear++] = value;

 }
 public int pop() {
	 rear--;
	 return arr[front++];  
   
 }
 public int peek() {
	 return arr[front];
 }
 public boolean isEmpty() {
	 return rear==0;
 }
 
 public boolean isFull() {
	 return rear == SIZE;
 }
 
 
 
}
