public class AssignQue32 {
	    public static void main(String[] args) {
	        int[] arr = { 2, 3, 6, 8, 10, 15, 20, 25,30};
	        int key = 10;

	        int comparisons = binarySearch(arr, key);

	        if (comparisons != -1) 
	        {
	            System.out.println("Key found at index " + comparisons);
	            System.out.println("Number of comparisons: " + (comparisons + 1));
	        } 
	        else {
	            System.out.println("Key not found in the array.");
	            System.out.println("Number of comparisons: " + (int) (Math.log(arr.length) / Math.log(2)) + 1);         }
	    }

	    public static int binarySearch(int[] arr, int key) {
	        int left = 0;
	        int right = arr.length - 1;
	        int comparisons = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            comparisons++;

	            if (arr[mid] == key) {
	                return mid; 
	            }
	            else if (arr[mid] < key) {
	                left = mid + 1; 
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1; 
	    }
	}


