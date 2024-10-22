public class Print_1_to_N_1 {
    // Print 1 to N without Using Loop
    public static void print_oneToN(int n) {
        if (n == 11) {
            return;
        }

        System.out.print(n + " ");
        print_oneToN(n + 1);
    }

    public static void main(String[] args) { // 1 2 3 4 5 6 7 8 9 10
        print_oneToN(1);
    }
}
