import java.util.Scanner;
public class Conditional_Statement {
    public static void main(String[] args) {
        // if,else,else if, switch, break
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number/age: ");
        int age = s.nextInt();

        if(age>18){
            System.out.println("More than 18");
        }else{
            System.out.println("Less than 18");
        }
    }
}
