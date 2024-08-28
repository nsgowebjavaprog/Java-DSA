// package Maths-DSA;
import java.util.*;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev_num = 0;
        int pali_num = num;

        while (num > 0) {
            int last_dig = num % 10;
            rev_num = (rev_num * 10) + last_dig;
            num = num / 10;
        }
        if (pali_num == rev_num) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
// OUTPUT
// Enter the number: 12345
// false

// Enter the number: 12321
// True
