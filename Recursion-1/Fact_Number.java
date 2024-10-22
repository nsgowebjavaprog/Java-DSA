// 1.Factorial of Number n! Eg: 5! = 5*4*3*2*1 = 120

public class Fact_Number {
    public static int fact_Number(int n) {
        if (n == 0 | n == 1) {
            return 1;
        } else {
            return n * fact_Number(n - 1);
        }
    }

    public static void main(String[] args) { // 120
        int n = 5;
        System.out.println(fact_Number(n));
    }
}
