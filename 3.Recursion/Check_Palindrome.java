public class Check_Palindrome {

    public static boolean isPalindrome(String s, int start, int end) {
        // Base case: if start crosses end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recurse for next characters
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
