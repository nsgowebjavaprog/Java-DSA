//                   DATA TYPES IN JAVA
//     1.PRIMITIVE                     2.NON-PRIMITIVE
//          1.BYTE-->1                     1.STRING
//          2.SHORT-->2                       2.ARRAY
//           3.CHAR   -2                       3.CLASS
//          4.BOOLEAN   1                    4.OBJECT
//          5.INT     4                       5.INTERFACE
//           6.LONG    8
//           7.FLOAT    4
//          8.DOUBLE    8


//  1st Program
//public class DATA_TYPE {
//    public static void main(String[] args) {
//          int a=10,b=2;
////        System.out.println("Range of BYTE: " +(2^7)+ " To " +((2^7)-1));
//        System.out.println("POWER: "+Math.pow(a,b));
//          byte q=10;
//        System.out.println(q);
//          char w='a';
//        System.out.println(w);
//          boolean e=true;
////        System.out.println("BBOOLEAN TYPE:"+type(boolean));
//          short s=100;
//        System.out.println(s);
//
//    }
//}

// 2nd Program{SUM OF A&B}

//public class DATA_TYPE {
//    public static void main(String[] args) {
//        int a=10,b=20;
//        int sum=a+b;
//        System.out.println("SUM OF A AND B:" +(sum));
//        System.out.println("SUM OF A & B: "+(a+b));
//    }
//}

//  #################################################################################   COMMENT LINE

// -----> SINGLE LINE COMMENT
/* NAGARAJ LONI
FROM BIJAPUR
AND SHIRAKANAHALLI
OK BYE!!!!!!!!
 */

// 3RD PROGRAM

/*  import java.util.*;
public class DATA_TYPE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of INT:");    // next, nextLine, next----->Int, Byte, Float, Double, Boolean, Short, Long
        int a = sc.nextInt();
        System.out.println("THE VALUE: "+a);
    }
}  */

// 4th Program---------->Sum input

/*   import java.util.*;
public class DATA_TYPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a =sc.nextInt();
        System.out.println("Enter the value of b:");
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of A and B : "+sum);
    }
}    */

// 5-th Program

//import java.util.*;
//public class DATA_TYPE {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a:");
//        int a =sc.nextInt();
//        System.out.println("Enter the value of b:");
//        int b =sc.nextInt();
//        int product = a*b;
//        System.out.println("Product of A and B : "+product);
//    }
//}

//6-th Program----->Area of Circle  3.14*rad*rad

/*   import java.util.*;
public class DATA_TYPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("The Area is : :" + area);
    }
}
*/

//7-th Progarm
//CONVERSION

//public class DATA_TYPE {
//    public static void main(String[] args) {
//        int a=23;
//        long v=a;
//        System.out.println(v);
//    }
//}

//8-th Program
//casting

/* public class DATA_TYPE {
    public static void main(String[] args) {
        float a = 12.12f;
        int b =(int)a;
        System.out.println(b);
    }
}
*/
// 9-th Program  ASCII
/* public class DATA_TYPE {
    public static void main(String[] args) {
        char a='a';
        char b= 'b';
        char c = 'c'-'a';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println((int)(c));
    }
}

// 10-th Program Type Promotion
/*public class DATA_TYPE {
    public static void main(String[] args) {
        int a = 12;
        float b = 12.12f;
        double c = 12.12121;
        double sum=a+b+c;
        System.out.println("Sum of 3 Value's: "+sum);       //  Sum of 3 Value's: 36.24120893188476     DOUBLE
    }
}
*/

public class DATA_TYPE {
    public static void main(String[] args) {
        // WRONG
//        byte a=10;
//        byte b =b*2;
//        System.out.println(b);
        // CORRECT
        byte b = 5;
        byte a = (byte) (b*2);
        System.out.println(b);
    }
}