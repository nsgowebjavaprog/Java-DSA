// public class RodCutting {

//     private static int cutRod(int[] price, int index, int n) {

//         if (n == 0) {
//             return 0;
//         }
//         if (index == 0) {
//             return n * price;
//         }

//         int notCut = cutRod(price, index - 1, n);

//         int cut = Integer.MIN_VALUE;
//         int rodLength = index + 1;
//         if (rodLength <= n) {
//             cut = price[index] + cutRod(price, index, n - rodLength);
//         }

//         return Math.max(notCut, cut);
//     }

//     public static void main(String[] args) {
//         int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
//         int size = price.length;
//         System.out.println("Maximum Obtainable Value is: " + cutRod(price, size - 1, size));
//     }
// }