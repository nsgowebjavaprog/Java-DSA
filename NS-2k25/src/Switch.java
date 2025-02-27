import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.print("Hi");
                break;

            case 2:
                System.out.print("Hello");
                break;

            case 3:
                System.out.print("Nice meet");
                break;

            default:

        }

    }
}
