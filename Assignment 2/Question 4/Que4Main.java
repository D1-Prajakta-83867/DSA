import java.util.Scanner;

public class Que4Main {
	public static void main(String[] args) {
		Que4 q = new Que4(3);
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek");
			System.out.print("Enter choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 0: 
				System.out.println("Thank you");
				
				break;
			case 1: 
				if(q.isFull())
					System.out.println("Queue is Full.");
				else {
					System.out.print("Enter value to insert : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2: 
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Poped data : " + q.pop());
			
				break;
			case 3: 
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked data : " + q.peek());
				
				break;
				
			case 4:System.out.println("Invalid choice."); 
				break;
			}
		
	}while(ch!=0);
		sc.close();
}
}
