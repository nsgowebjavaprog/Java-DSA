//package Maths-DSA;

import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev_num = 0;

        while (num > 0) {
            int last_dig = num % 10;
            rev_num = (rev_num * 10) + last_dig;
            num = num / 10;
        }
        System.out.println("The reverse of the number is: " + rev_num);
    }
}
// OUTPUT
// Enter the number: 123456789
// The reverse of the number is: 987654321
