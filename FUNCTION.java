// 1.Basic

//public class Function {
//    public static void print_Hello(){
//        System.out.println("Hello NS");
//        System.out.println("Hello NS");
//        System.out.println("Hello NS");
//    }
//
//    public static void main(String[] args) {
//        print_Hello();
//    }
//}

// 2. SUM----PARAMETER

//import java.util.Scanner;
//
//public class Function {
//    public static void calcu_sum(int a, int b){
//        int sum = a+b;
//        System.out.println("Sum is : "+sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b = sc.nextInt();
//        calcu_sum(a,b);
//    }
//}
//OUTPUT::Scanner10
//29
//Sum is : 39

// 3.Call By Value -------->{only call by value}-------------SWAP

//public class Function {
//    public static void call_by_value(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a =" + a);
//        System.out.println("b ="  +b);
//    }
//
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        call_by_value(a,b);
//        System.out.println("a : "+a);
//        System.out.println("b : "+b);
//
//    }
//}
//output::
//a =20
//b =10
//a : 10
//b : 20


// 4.PRODUCT

//public class Function {
//    public static int product(int a,int b){
//        int multi = a*b;
//        return multi;
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int prod = product(a,b);
//        System.out.println(prod);
//        product(a,b);
//    }
//
//}

// 5.FACTORIAL

//public class Function {
//    public static int factnum(int n) {
//        int f=1;
//
//        for (int i = 1; i <=n ; i++) {
//            f = f * i;
//            // f 1st result eg==2!==2,2*3=6  (i=3)
//        }
//        return f;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(factnum(5));       //output : 120
//    }
//}

// 6.Binomial coefficient

//  nCr =  n! / r!(n-r)!

//public class Function {
//    public static int bin_of_coeffi(int n, int r){
//        int fact_n = factorial(n);
//        int fact_r = factorial(r);
//        int fact_nmr = factorial(n-r);
//
//        int bin_of_coeffi = fact_n / (fact_r * fact_nmr);
//        return bin_of_coeffi;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(bin_of_coeffi(5,2));
//    }
//}

// METHOS 1.USER DEFINED
//        2.INBUILT METHOD EG: POW, SQRT, MAX, NEXTINT, ETC.

// 1.FUNCTION OVERLOADING

//public class Function {
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(10,20));    // 30
//        System.out.println(sum(11,22,33));   // 66
//    }
//}


// 2. Function Overloading Using DATA TYPES

//public class Function {
//    public static int sum_int(int a, int b){
//        return a+b;
//    }
//    public static int multi_float(float a,float b, float c){
//        return  a+b+c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum_int(10,20));
//        System.out.println(multi_float(11.1f,12.2f,13.3f));
//    }
//}

// 3. PRIME NUMBER

//public class Function {
//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        for(int i=2; i<=n-1; i++){
//            if(n % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(5));      // true
//    }
//}

// 4. PRIME NUMBER

//public class Function {
//    public static boolean isPrime(int n){
//        if (n == 2){
//            return true;
//        }
//        for (int i=2; i<=Math.sqrt(n); i++){
//            if (n%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(11));
//    }
//}

// 5.PRIME NUMBER B/W RANGE()

//public class Function {
//    public static void primeInRange(int n){
//        for (int i = 2; i <=n ; i++) {
//            if (isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        primeInRange(20);
//    }
//}

// 6.convert from Binary to Decimal

//public class Function {
//    public static void binTodem(int binNum){
//        int pow = 0;
//        int decNum = 0;
//
//        while (binNum > 0){
//            int lastDigit = binNum % 10;
//            decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
//
//            pow++;
//            binNum = binNum/10;
//        }
//        System.out.println("Decimal of" + binNum + " = "+ decNum);
//    }
//
//    public static void main(String[] args) {
//        binTodem(0011);                        // Decimal of0 = 9
//    }
//}

// 7. Decimal to Binary

public class Function {
    public static void decTobin(int n){
        int myNum = n;
        int pow = 0;
        int binNum =0;

        while (n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n= n/2;
        }
        System.out.println("Binary to "+myNum+"="+binNum);

    }

    public static void main(String[] args) {    // Binary to 10=1010
        decTobin(10);
    }
}