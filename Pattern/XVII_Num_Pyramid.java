//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5

// row-->    n-i[space]-----1++
// n-i space 1/Row_Num

public class XVII_Num_Pyramid {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
