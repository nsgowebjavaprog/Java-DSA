public class Factorial {
    public static int facto(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }

    public static void main(String[] args) {
    System.out.println(facto(5));
}
}
