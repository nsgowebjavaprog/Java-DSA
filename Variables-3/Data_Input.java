import java.util.Scanner;

public class Data_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Do you have a girlfriend? (true/false)");
        boolean gf = sc.nextBoolean();

        System.out.println("Name of Student: "+name+"\n Age is: "+age+"\n and GirlFriend is: "+gf);
    }
}