import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.print("Enter the User Name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello "+name+" Good Morning");

        System.out.print("Enter "+name+" Age: ");
        int age = s.nextInt();
        System.out.println(name+" age is: "+age);

        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("Sum of a & b: "+c);
    }
}
