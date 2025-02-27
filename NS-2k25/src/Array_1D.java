import java.util.Scanner;
public class Array_1D {
    /* Non-Preemptive Type */
    public static void main(String[] args) {
       //Array

       // type[] name = new type[size];

       // Eg: int[] arr = new int[10];

        // Start with Zero-Index

        // Initialization and Declaration






//        int[] arr = new int[4];
//        arr[0] = 100;
//        arr[2] = 101;
//        arr[3] = 102;
//
//        // System.out.println(arr[0]);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(arr[i]);
//        }







//        int marks[] = {123,212,323,445,514,654,723,829,100};
//            for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }





        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size:");
        int size = sc.nextInt();
        int num[] = new int[size];

        //Input
        System.out.println("Enter the Number One by One: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // Output
        System.out.println("Array Elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }

    }
}
