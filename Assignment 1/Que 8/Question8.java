
import java.util.Scanner;

public class Question8 {
	
	public static void sortArray(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {	
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static int findRankofInteger(int [] arr,int ele) {
		
		sortArray(arr);
		
		int rank=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=ele) {
				rank++;
			}
			else
				break;
		}
		return rank;
		
	}
	public static void main(String[] args) {
		int [] arr={ 10, 20, 15, 3, 4, 4, 1 }; 
		System.out.print("Enter element to find rank:");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		System.out.println("Rank of "+ele+" is:"+findRankofInteger(arr,ele));
		
		

	}

}
