// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class XV_Butterfly_Pattern {
    public static void main(String[] args) {

        // Row_Num | No.of Space | Row_Num

        // Row_Num | 2*n-i | Row_Num

        // Eg:- 1 | 2*5-1 | 1

        int n = 4;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // 1st Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            int space = 2 * (n - i);

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // 1st Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            int space = 2 * (n - i);

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd Half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}