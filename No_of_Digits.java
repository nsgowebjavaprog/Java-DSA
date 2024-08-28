import java.util.Scanner;

class No_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count = count + 1;
            num = num / 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
// OUTPUT

// Enter the number: 12345
// Number of digits: 5

// TIME & SPACE COMPLEXITY :- O (log (N)) ** Division operation **
