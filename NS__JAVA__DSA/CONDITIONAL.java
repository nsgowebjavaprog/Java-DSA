// 1-st Program {large}
/*public class CONDITIONAL {
    public static void main(String[] args) {
        System.out.println("Hi NS Loni");
        int a =10;
        int b=12;
        if (a>=b)
            System.out.println("a is large");
        else
            System.out.println("b is large");
    }
}*/



// 2nd-Program {Even or Odd}
/*import java.util.Scanner;
public class CONDITIONAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a =sc.nextInt();
        if (a%2==0) {
            System.out.println("Even Number : "+a);
        }
        else{
            System.out.println("Odd number : "+a);
        }
    }
}*/



// 3rd Program  {if,else if,else}
/*import java.util.Scanner;
public class CONDITIONAL {
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        if (age<18){
            System.out.println("Child");
        }
        else if (age>=18 && age<=60){
            System.out.println("Working Persion ");
        }
        else{
            System.out.println("Old Man");
        }
    }
}*/



// 4th- Program     {Income Tax Calcu}
/*import java.util.Scanner;

public class CONDITIONAL {
    public static void main(String[] args) {
        System.out.println("Enter Income : ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if (income<500000){
            System.out.println("No Tax : ");
        }
        else if (income>500000 && income<1000000){
            tax=(float)(income*0.20);
            System.out.println("20% Tax : "+tax);
        }
        else{
            tax=(float) (income*0.30);
            System.out.println("30% Tax : "+tax);
        }
    }
}*/

// 5th-Program  {large of 3-NUM}
/*public class CONDITIONAL {
    public static void main(String[] args) {
        int a=110,b=220,c=30;
        if ((a>b)&&(a>c)){
            System.out.println("A");
        }
        else if(b>c){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}*/

// 6th-Program    {Pass/Not}
/*public class CONDITIONAL {
    public static void main(String[] args) {
        int marks = 98;
        String result= marks>=33? "Pass":"Not";
        System.out.println( result);
    }
}*/

/*import java.util.Scanner;

// 7th-Program  {switch-case}
public class CONDITIONAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a =sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char op=sc.next().charAt(0);

        switch (op){
            case '+' :
                System.out.println("add: "+(a+b));
                break;
            case '-':
                System.out.println("sub"+(a-b));
                break;
            case '*':
                System.out.println("mul: "+(a*b));
                break;
            default:
                System.out.println("Try again");
        }
    }
}
*/

//