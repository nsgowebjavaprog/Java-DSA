//package Recursion-DSA;

public class Total_Sum_1_n {
    public static void print_number(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum += i;
        print_number(i + 1, n, sum);
    }

    public static void main(String[] args) {
        print_number(1, 5, 0);
    }
}
// 1+2+3+4+5 = 15