//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

// row-->    n-i[space]-----n_*

public class XVI_Solid_Rhombus {
    public static void main(String[] args) {
        // Totla Rows
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
