//1.PATTERN

//public class KUNAL_PATTERN {
//    public static void patter_one(int n){
//        //outer loop
//        for (int row = 1; row <=n ; row++) {
//            //inner loop
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        patter_one(5);
//    }
//}
////OUTPU:
//        *
//        **
//        ***
//        ****
//        *****

// 2.RECTANGLE

//public class KUNAL_PATTERN {
//    public static void main(String[] args) {
//        rect_patter(6);
//    }
//    public static void rect_patter(int n){
//        //outer
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//}
////OUTPUT:
//        ******
//        ******
//        ******
//        ******
//        ******
//        ******

//3.PATTERN

//public class KUNAL_PATTERN {
//    public static void main(String[] args) {
//        tri_angle(5);
//    }
//    public static void tri_angle(int n){
//        //outer no.of lines
//        for (int i = 1; i <=n ; i++) {
//            //inner for loop
//            for (int j = n-i+1; j >=1 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}
////OUTPUT:
//        *****
//        ****
//        ***
//        **
//        *


// 4.PATTERN
//public class KUNAL_PATTERN {
//    public static void main(String[] args) {
//        number_pattern(5);
//    }
//    public static void number_pattern(int n){
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//    //outer loop
//
//}
////OUTPUT:
//        1
//        12
//        123
//        1234
//        12345


// 5.PATTERN

//public class KUNAL_PATTERN {
//    public static void main(String[] args) {
//        half_diamand(4);
//    }
//    public static void half_diamand(int n) {
//        //outer
//            for (int i = 1; i <= n; i++) {
//                //1st HALF
//                //inner
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//            //2nd HALF
//            for (int i = n; i >= 1; i--) {
//
//
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }
//// OUTPUT:
//        *
//        **
//        ***
//        ****
//        ****
//        ***
//        **
//        *


// 6.PATTERN

//public class KUNAL_PATTERN {
//    public static void main(String[] args) {
//        full_diamand(5);
//    }
//    public static void full_diamand(int n){
//        for (int row=0; row<2*n;  row++){
//            int totalColInRow = row >n ? 2*n - row: row;
//
//            int NoOfSpace = n - totalColInRow;
//            for(int space=0; space< NoOfSpace;  space++){
//                System.out.print(" ");
//            }
//            for (int col = 0; col < totalColInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}  //OUTPUT:    *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *


// 7.PARTTERN

//public class KUNAL_PATTERN {
//    public static void num_pattern(int n){
//        //outer
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=(n-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >=1 ; j--) {
//                System.out.print(j);
//            }
//            for (int j =2; j <=i ; j++) {
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        num_pattern(5);
//    }
//}
//// OUTPUT:
//             1
//            212
//           32123
//          4321234
//         543212345


public class KUNAL_PATTERN {
    public static void sq_num_box(int n) {           //n==4
        //outer
        for (int i = 1; i <=n ; i++) {

        }
    }
}
