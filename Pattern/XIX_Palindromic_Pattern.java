//           1
//         2 1 2
//       3 2 1 2 3
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5

// n-i-space  ------ row-num
// n-i-space -------row_num to 1 && 1 to row_num

public class XIX_Palindromic_Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 1st half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
