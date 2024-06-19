//Insertion sort comparisons count

import java.util.Arrays;

public class Que2 {

  public static void insertionSort(int arr[],int n){
		 int comp = 0;
	  for(int i=1; i<n; i++) {
		
		  int temp = arr[i];
		  int j = i-1;
		  while(j>=0 && arr[j] < temp) {
			  comp++;
			  arr[j+1] = arr[j];
			  j--;
			  
		  }
		  arr[j+1] = temp;  
	  }	 
	  System.out.print("No of comparisions : "+comp);

  }
  public static void main(String [] args) {
	
	  int arr[] = {91,42,21,65,10,33};
	  //int arr[] = {10, 21, 33, 42, 65, 91};
	  System.out.println("Array before sort :"+Arrays.toString(arr));
	  insertionSort(arr,arr.length);
	  System.out.print("\nArray after sort :"+Arrays.toString(arr));
  
  }
  
  
}
