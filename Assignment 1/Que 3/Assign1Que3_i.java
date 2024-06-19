public class Assign1Que3 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 15, 6, 3 };
        int key = 3;

        int comparisons = linearSearch(arr, key);

        if (comparisons != -1) {
            System.out.println("Key found at index " + comparisons);
            System.out.println("Number of comparisons: " + (comparisons + 1)); 
            } else {
            System.out.println("Key not found in the array.");
            System.out.println("Number of comparisons: " + arr.length); 

        }
    }

    public static int linearSearch(int[] arr, int key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++; 
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
}
