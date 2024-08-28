import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int count = 0;
        int sum = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        number = originalNumber;

        while (number > 0) {
            int digit = number % 10;
            sum = (int) (sum + Math.pow(digit, count));
            number = number / 10;
        }
        if (sum == originalNumber) {
            System.out.println(" is an Armstrong number");
        } else {
            System.out.println(" is not an Armstrong number");
        }
    }
}