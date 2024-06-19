
public class Assign1Que2 {

	    public static int linearSearchLastOccurrence(int[] arr, int key) {
	        int lastIndex = -1; // Initialize with -1 to indicate key not found

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                lastIndex = i; // Update lastIndex whenever key is found
	            }
	        }

	        return lastIndex;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 5, 7, 2, 8, 2, 9, 5};
	        int key = 2;

	        int lastIndex = linearSearchLastOccurrence(arr, key);

	        if (lastIndex != -1) {
	            System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
	        } else {
	            System.out.println(key + " not found in the array.");
	        }
	    }
	}



