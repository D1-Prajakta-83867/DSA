
public class Palindrome2 {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input)); // true
    }
}

