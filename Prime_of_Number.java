// Num = 30 => 1,2,3,5,6,10,15,30 --> [2,3,5]
// Num = 35 => 1,5,7,35 -->[5,7]

import java.util.Scanner;

public class Prime_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        printPrimeDivisors(number);
    }

    public static void printPrimeDivisors(int number) {
        System.out.println("Prime divisors of " + number + " are:");
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
                number /= i;
            }
        }
        if (number > 2 && isPrime(number)) {
            System.out.print(number);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}