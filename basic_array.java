import java.util.Scanner;

public class basic_array{
   public static void main(String[] args) {

       //same datatype store --->ele are contiguous memory location
       int marks[] = new int[10];

       System.out.println("Length of ARRAY IS : "+marks.length);   //Length of ARRAY IS : 10

       Scanner sc = new Scanner(System.in);

       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();
       System.out.println("java : "+marks[0]);
       System.out.println("SQL : "+marks[1]);
       System.out.println("python : "+marks[2]);

       int percentage = (marks[0] + marks[1] + marks[2])/3;
       System.out.println("Pecentage : "+percentage+ "%");
   }
}
