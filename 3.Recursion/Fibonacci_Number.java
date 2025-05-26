public class Fibonacci_Number {

    public static int fib_series(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib_series(n - 1) + fib_series(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Fib: " + fib_series(n));
    }
}