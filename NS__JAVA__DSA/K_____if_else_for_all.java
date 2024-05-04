//import java.util.Scanner;
//
//public class KUNAL_if_else_for_all {
//    public static void main(String[] args) {
//
//        //1st If-Else
//       /* int salary = 20000;
//        if (salary>10000){
//            salary+=10000;
//            System.out.println("10% Increment: "+salary);
//        }else if (salary>20000){
//            salary+=20000;
//            System.out.println("20% Increment: "+salary);
//        }else {
//            salary+=50000;
//            System.out.println("50% Increment: "+salary);
//        }
//
//*/
//        // 2nd For
//       /* for (int i=0;i<5;i++)
//            System.out.println("Hello");*/
//
//        // 3rd  While
//        /*int i=0;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }*/
//
//        // 4th Do Execute atleast once
//        /*int i=1;
//        do{
//            System.out.println(+i+ "Hello");
//            i++;
//        }while (i<=5);*/
//
//        // 5th Program  LOWER/UPPER
//        /*char ch='H';
//        if (ch>='a' && ch<='z'){
//            System.out.println("Lower case: ");
//        }
//        else {
//            System.out.println("Upper case:");
//        }
//*/
//        // 6-th Fibonaciii
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        int a=0,b=1,count=2;
//
//        while (count<=n){
//            int temp = b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
//*/
//
//        //7-th
//       /* int n=45536;
//
//        int count=0;
//        while (n>0){
//            int rem = n%10;
//            if(rem==5){
//                count++;
//            }
//            n=n/10;
//        }System.out.println(count);
//
//        */
//        // 8-th
//
//
//    }
// SWITCH
//
//import java.util.Scanner;
//
//public class KUNAL_if_else_for_all {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Fruit: ");
//        String fruit = sc.next();

//        switch (fruit){
//            case "mango":
//                System.out.println("King of fruit:");
//                break;
//
//            case "apple":
//                System.out.println("Red kashmir:");
//                break;
//
//            case "Orange":
//                System.out.println("Orange colur fruit:");
//                break;
//
//            default:
//                System.out.println("Not macthed:");
//            int day= sc.nextInt();
//            switch (day){
//                case 1 -> System.out.println("monday");
//                case 2 -> System.out.println("tonday");
//                case 3 -> System.out.println("wonday");
//                case 4 -> System.out.println("tronday");
//                case 5 -> System.out.println("fonday");
//                case 6 -> System.out.println("ssonday");
//                case 7 -> System.out.println("sunday");
//
//        }

//    }
//}

// NESTED__switch-------LLOOOOOOOOOOOOOOOOOOOOP

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class KUNAL_if_else_for_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and DEP : ");
        int id = sc.nextInt();
        String dep = sc.next();

        switch (id) {
            case 1 -> System.out.println("NAGARAJ LONI");
            case 2 -> System.out.println("NS_LONi");

            case 3 -> {
                System.out.println("ns");
                switch (dep) {
                    case "it" -> System.out.println("IT DEPARTMENT");
                    case "manage" -> System.out.println("MANAGER OF IT");
                    default -> System.out.println("WOWWWWWW");
                }


            }
            default -> System.out.println("dfbshdgbfyhzsdgfydg");
        }
    }

}

