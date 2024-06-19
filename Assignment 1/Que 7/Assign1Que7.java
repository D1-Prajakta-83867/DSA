import java.util.HashMap;
public class Assign1Que7 {
	
	    public static void main(String[] args) {
	        int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

	        int firstNonRepeating = findFirstNonRepeating(arr);

	        System.out.println("First non-repeating element is: " + firstNonRepeating);
	    }

	    public static int findFirstNonRepeating(int[] arr) {
	        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

	        for (int num : arr) {
	            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
	        }

	        for (int num : arr) {
	            if (elementCountMap.get(num) == 1) {
	                return num; 
	            }
	        }

	        return Integer.MIN_VALUE; 
	        // Assuming no non-repeating element returns this value, can be adjusted as needed
	    }
	}

