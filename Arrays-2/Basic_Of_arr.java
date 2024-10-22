import java.util.Scanner;

public class Basic_Of_arr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Declaration
            System.out.print("Enter the Size of array: ");
            int size = sc.nextInt();
            System.out.print("Enter the elements in array: ");
            int nums[] = new int[size];

            // Input
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            // Output
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

}