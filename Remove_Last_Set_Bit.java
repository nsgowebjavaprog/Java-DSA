public class Remove_Last_Set_Bit {
    public static void main(String[] args) {
        // 1. N = 13 -> 1 1 0 1 ANS---> 1 1 0 0
        // 2. N = 12 -> 1 1 0 0 ANS---> 1 0 0 0
        // 3. N = 16 -> 1 0 0 0 0 ANS---> 0 0 0 0 0

        // logic: n 7 n-1

        int n = 16;
        int a = 13;
        int b = 12;
        n = (n & (n - 1));
        a = (a & (a - 1));
        b = (b & (b - 1));
        System.out.println("Result: " + n); // Result: 0
        System.out.println("Result: " + a); // Result: 12
        System.out.println("Result: " + b); // Result: 8
    }
}
