// Prog---1

//public class PATTERNS {
//    public static void main(String[] args) {
//        for (int i=0;i<=4;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//OUTPUT===
//*
//**
//***
//****

// 2md Prog
//
//public class PATTERNS {
//    public static void main(String[] args) {
//    char ch='A';
//    int n=4;
//    for (int i=1;i<=n;i++){
//        for (int j=1;j<=i;j++){       //  A
//            System.out.print(ch);     //  BC
//            ch++;                     //  DEF
//        }                             //  GHIJ
//        System.out.println();
//    }
//    }
//}

// 3rd-Prog
//public class PATTERNS {
//    public static void hollow_rectangle(int total_row, int total_col){
//        //oyter  loop
//        for(int i=1; i<=total_row;i++ ){
//            //inner loop
//            for(int j=1;j<=total_col; j++){
//                //cell
//                if (i ==1 || i==total_row || j==1 || j==total_col){
//                //boundry
//                System.out.print("*");
//            }   else{
//                System.out.print(" ");
//                 }
//            }
//        System.out.println();
//        }
//    }
//
//public static void main(String[] args) {
//    hollow_rectangle(4,5);
//}
//}
//OUTPUT:
//        *****
//        *   *
//        *   *
//        *****

// 4.INVERTED AND ROTATED HALF PYRAMID

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.io.OutputStream;
import java.security.PublicKey;

//public static void PATTERNS(int n){
//    //outer
//    for (int i=1; i<=n; i++) {
//        //space
//        for (int j=1; j>=n-i; j++){
//            System.out.print(" ");
//        }
//        for (int j=1; j<=i; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//}
//
//public static void main(String[] args) {
//    PATTERNS(4);
//}

// 5.
// 1 2 3 4 5    1---->5    n=5
// 1 2 3 4      1---->4   [n-i+1]
// 1 2 3        1---->3
// 1 2          1---->2
// 1            1---->1

//public static void PATTERNS(int n){
//    for (int i=1; i<=n; i++){
//        for (int j=1;j<=n-i+1;j++){
//            System.out.print(j+" ");
//        }
//        System.out.println();
//    }
//}
//
//public static void main(String[] args) {
//    PATTERNS(7);
//}


//6.hOOLOOWW

//public class PATTERNS {
//    public static void hollow_rectangle(int totRows, int totCols) {
//        for (int i=1;i<=totRows; i++){
//            for (int j=1; j<=totCols; j++){
//                if(i==1 || i==totRows || j==1 || j==totCols){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        hollow_rectangle(4,5);
//    }
//}
//OutputStream
//        *****
//        *   *
//        *   *
//        *****


// 7.INVERTED AND ROTATED HALF PYRAMID
//public class PATTERNS {
//public static void inverted_and_rotated_half_pyramid(int n) {
//    //line
//
//    for (int i = 1; i <= n; i++) {
//        //space
//
//        for (int j = 1; j <= n - i; j++) {
//            System.out.print(" ");
//            //print *
//        }
//        for (int j = 1; j <= i; j++) {
//            System.out.print("*");
//        }
//
//        System.out.println();
//    }
//}
//
//    public static void main(String[] args) {
//        inverted_and_rotated_half_pyramid(5);
//    }
//}
//OUTPUT:
//            *
//           **
//          ***
//         ****
//        *****


// 8. inverted half-pyramid with numbers
//
//public class PATTERNS {
//    public static void inverted_half_pyramid_with_numbers(int n){
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        inverted_half_pyramid_with_numbers(5);
//    }
//}
//OUTPUT:
//        12345
//        1234
//        123
//        12
//        1


// 9. FLOYD'S TRIANGLE
//public class PATTERNS {
//    public static void floyds_triangle(int n){
//        int counter=1;
//        for (int i=1; i<=n; i++){
//
//            for (int j=1; j<=i; j++){
//                System.out.print(counter+ " ");
//                counter++;
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        floyds_triangle(5);
//    }
//}
//OUTPUT:
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

// 10.0--1 TRIANGLE
//public class PATTERNS {
//    public static void zero_one_triangle(int n){
//
//        for (int i=1; i<=n; i++){
//
//            for (int j=1; j<=i;  j++){
//                if ((i+j) % 2 == 0){
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
//        zero_one_triangle(5);
//    }
//}
//
//// OUTPUT:
//        1
//        01
//        101
//        0101
//        10101


// 11. BUTTERFLY PATTERN  8
//public class PATTERNS {
//    public static void butterfly_pattern(int n) {
//
//        // 1st HALF
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                //stars
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        // 2nd HALF
//
//        for (int i =n; i >= 1; i--) {
//
//            for (int j = 1; j <= i; j++) {
//                //stars
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        butterfly_pattern(5);
//    }
//}
//output:
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 12. SOLID RHOMBUS
//public class PATTERNS {
//    public static void solid_rhombus(int n){
//        for (int i=1; i<=n; i++){
//            //spaces
//            for (int j=1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        solid_rhombus(5);
//    }
//}
////OUTPUT:
//               *****
//              *****
//             *****
//            *****
//           *****

// 13.HOLLOW RHOMBUS
//public class PATTERNS {
//    public static void hollow_rhombus(int n){
//        for (int i=1; i<=n; i++){
//            //space
//            for (int j=1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            // hollow rectangle - stars
//            for (int j=1; j<=n; j++){
//                if(i==1 || i==n || j==1|| j==n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        hollow_rhombus(5);
//    }
//}
//// OUTPUT:
//                *****
//               *   *
//              *   *
//             *   *
//            *****


//14.DIAMOND
//public class PATTERNS {
//    public static void diamond(int n){
//        for (int i=1; i<=n; i++){
//            //spaces
//            for (int j=1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=(2*i)-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //2nd HALF
//
//        for (int i=n; i>=1; i--){
//            //spaces
//            for (int j=1;j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=(2*i)-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        diamond(6);
//    }
//}
//OUTPUT:
//     *
//    ***
//   *****
//  *******
// *********
//***********
//***********
// *********
//  *******
//   *****
//    ***
//     *

// 15.NUMBER PYRAMID
//public class PATTERNS {
//    public static void number_pyramid(int n){
//        //outer
//        for (int i=1; i<=n; i++){
//            //space(inner)
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//                }
//                //number
//                for (int j=1; j<=i; j++){
//                    System.out.print(i+" ");
//            }
//        System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        number_pyramid(5);
//    }
//}
//OUTPUT:
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5

// 16.PALINDROMIC PATTERN WITH NUMBER
public class PATTERNS {
    public static void palindromic_pattern_with_number(int n){
        //outer
        for (int i=1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //descending
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            //incresing
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromic_pattern_with_number(5);
    }
}
////OUTPUT:
//               1
//              212
//             32123
//            4321234
//           543212345