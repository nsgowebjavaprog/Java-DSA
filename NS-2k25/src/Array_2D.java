import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args) {

        // Declaration

        // int[][] name = new int[row_size][col_size];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Size: ");
        int row = sc.nextInt();
        System.out.print("Enter Col size: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the Ele's: ");

        //Input
        //row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
