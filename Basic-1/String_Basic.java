import java.util.Scanner;

public class String_Basic {
    public static void main(String[] args) {
        // Declaration of String
        String name1 = "NS LONI";
        System.out.println(name1);

        try (// Input from User--String
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name of Student: ");
            String name = sc.nextLine();
            System.out.println("Name: " + name);
        }
    }
}
