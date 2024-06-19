
public class Assign1Que5 {

	
	    public static void main(String[] args) {
	        int[] arr = { 25, 20, 15, 10, 8, 6, 3, 2 };
	        int key = 2;

	        int index = binarySearchDescending(arr, key);

	        if (index != -1) {
	            System.out.println("Key found at index " + index);
	         
	        } else {
	            System.out.println("Key not found in the array.");
	        
	        }
	    }

	    
	    public static int binarySearchDescending(int[] arr, int key) {
	        int left = 0;
	        int right = arr.length - 1;
	        int index = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            index++; 

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                right = mid - 1;
	            } else {
	                left = mid + 1; 
	            }
	        }
	        return -1; 
	    }
	}


