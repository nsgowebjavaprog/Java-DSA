public class Print_N_to_1 {

    public static void printN_To_1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printN_To_1(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printN_To_1(n);
    }
}
