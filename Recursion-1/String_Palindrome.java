//check Given String Is Pallindrome or n0t
public class String_Palindrome {
    public static boolean pallindroma_String(String str, int i) {
        int n = str.length();

        // Convert to lowercase for case-***sensitive*** comparison
        str = str.toLowerCase();

        if (i > n / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return pallindroma_String(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "maam";
        System.out.println(pallindroma_String(str, 0));
    }
}
