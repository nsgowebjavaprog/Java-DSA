// 10 -> 1,2,5,10
// 18 -> 1,2,3,6,9,18
//   ------------------------
//   |1 * 18 = 18           |
//   |2 * 9 = 18            |  if(n/i) != i--->pf-->n/i
//   |3 * 6 = 18            |
//   ------------------------
// 6 * 3 = 18
// 9 * 2 = 18
// 18 * 1 = 18

// Only consider small * big Take half = 1,2,3, then 6,9,18

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("The divisors of " + number + " are:");
        printAllDivisors(number);
    }

    public static void printAllDivisors(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                if (i != number / i) {
                    System.out.print(number / i + " ");
                }
            }
        }
        System.out.println();
    }
}
// OUTPUT

// TC: O (root(N))

// Enter a number: 18
// The divisors of 18 are: 1 18 2 9 3 6

// Enter a number: 10
// The divisors of 10 are:1 10 2 5