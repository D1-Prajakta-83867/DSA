
public class Assign1Que6 {

	    public static void main(String[] args) {
	        int[] arr = { 3, 6, 2, 8, 6, 4, 6, 7 };
	        int key = 6;
	        int n = 2; // Find the 3rd occurrence of key

	        int index = findNthOccurrence(arr, key, n);

	        if (index != -1) {
	            System.out.println("The " + n + "th occurrence of " + key + " is at index: " + index);
	        } else {
	            System.out.println("The " + n + "th occurrence of " + key + " is not found.");
	        }
	    }

	    public static int findNthOccurrence(int[] arr, int key, int n) {
	        int count = 0; 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                count++;
	                if (count == n) {
	                    return i; 
	                }
	            }
	        }
	        return -1; 
	    }
	}

