
public class Palindrome1 {

    
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input)); // true
    }
}
