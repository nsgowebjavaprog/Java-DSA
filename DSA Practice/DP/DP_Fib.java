public class DP_Fib {

    public static int fin_num(int n) {
        if (n < 1) {
            return n;
        }
        int first = 0;
        int sec = 1;
        int third = 0;

        for (int i = 2; i <= n; i++) {
            third = first + sec;
            first = sec;
            sec = third;
        }
        return third;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fin_num(n));
    }
}