import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }
}
// OUTPUT
// Enter A Number: 13
// 13 is an odd number

// Enter A Number: 12
// 12 is an even number