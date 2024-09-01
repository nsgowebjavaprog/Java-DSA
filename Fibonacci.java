//package Recursion-DSA;

public class Fibonacci {
        public static void main(String[] args) {
            int n = 9;
            int result = fib(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }
    
        public static int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
    
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
