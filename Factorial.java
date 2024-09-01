//package Recursion-DSA;

public class Factorial {
    public static int calcu_fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_n_1 = calcu_fact(n - 1);
        int fact_n = n * fact_n_1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcu_fact(n));
    }
}
// OUTPUT

// 120