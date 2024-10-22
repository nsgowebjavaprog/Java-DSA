//Fibonacci Number:-It's a Sum of Privious Two Number's. 0,1,1,2,3,5,8,13,21,34,55.........

public class Fib_Num {
    public static int fib_number(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib_number(n - 1) + fib_number(n - 2);

        }
    }

    public static void main(String[] args) { // 55
        int n = 10;
        System.out.println(fib_number(n));
    }
}
