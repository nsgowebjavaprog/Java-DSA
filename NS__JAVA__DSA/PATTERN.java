// 1 SQUARE HOLLOW PATTERNS


//public class PATTERN_PRACTICE {
//    public static void hollow_square_pattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            //inner
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("*");
//                   } else{
//                    System.out.print(" ");
//                }
//            }
//                System.out.println();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        hollow_square_pattern(5);
//    }
//}
//output:::
//        *****
//        *   *
//        *   *
//        *   *
//        *****

// 2 NUMBER TRIANGLE

//public class PATTERN_PRACTICE {
//    public static void number_triangle(int n){
//        for (int i= 1; i <=n ; i++) {
//            // inner
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        number_triangle(5);
//    }
//}
//output:::
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5

// 3.number pyramid triangle

//public class PATTERN_PRACTICE {
//    public static void number_pyramid_triangle(int n){
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = n; j >=1 ; j--) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        number_pyramid_triangle(5);
//    }
//}
//output::
//        1
//        12
//        123
//        1234
//        12345

// 4.NUMBER REVERSE PYRAMID

//public class PATTERN_PRACTICE {
//    public static void number_rev_pyramid(int n){
//        //outer
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = i-1; j <=n-1 ; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        number_rev_pyramid(5);
//    }
//}
//OUTPUT::::
//        1234
//        123
//        12
//        1

// 5.`number changing pyramid

//public class PATTERN_PRACTICE {
//    public static void number_changing_pyramid(int n){
//        //outer
//        //COUNTER
//        int counter=1;
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(counter+" ");
//                counter++;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        number_changing_pyramid(5);
//    }
//}
//output:
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

// 6.ZERO---ONE TRIANGLE

//public class PATTERN_PRACTICE {
//    public static void one_zero_triangle(int n){
//        //outter
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            for (int j = 1; j <=i ; j++) {
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        one_zero_triangle(5);
//    }
//}
//output::1
//        01
//        101
//        0101
//        10101

// 7.PALLINDROME TRIANGULER

//public class PATTERN_PRACTICE {
//    public static void pallindrom_triangle(int n){
//        //outer
//        for (int i = 1; i <=n ; i++) {
//            //inner
//            //space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = i; j >=1 ; j--) {
//                System.out.print(j);
//            }
//
//            for (int j = 2; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pallindrom_triangle(5);
//    }
//}
//output:::
//            1
//           212
//          32123
//         4321234
//        543212345

//// 8.RHOMBUS PATTERN
//
//public class PATTERN_PRACTICE {
//    public static void rhombus_pattern(int n){
//        //outer
//        for (int i = 1; i <=n ; i++) {
//            //inner
//                 //SPACE
//            for (int j = i-1; j <=n ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        rhombus_pattern(5);
//    }
//}
//output::
//                *****
//               *****
//              *****
//             *****
//            *****

// 9.DIAMOND PATTERN

//public class PATTERN_PRACTICE {
//    public static void diamond_number(int n){
//        //outer
//        //1st half
//        for (int i = 1; i <=n ; i++) {
//            //inner loop
//            //SPACE
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //2nd half
//        for (int i = n-1; i >=1 ; i--) {
//            //inner loop
//            //SPACE
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        diamond_number(5);
//    }
//}
//output:::
//            *
//           ***
//          *****
//         *******
//        *********
//         *******
//          *****
//           ***
//            *
