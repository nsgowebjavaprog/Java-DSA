import java.util.Scanner;

public class Palindrome_String {

    public static boolean palindrome_string_or_not(String str) {
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(n - 1 - i); 

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string to check whether it is palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); 
        System.out.println(palindrome_string_or_not(str));
    }
}
