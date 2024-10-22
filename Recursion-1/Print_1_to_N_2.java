// Print 1 to N Using Recursion
public class Print_1_to_N_2 {
    public static void print_1_to_N(int n) {
        if (n > 0) {
            print_1_to_N(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args) { // 1 2 3 4 5 6 7 8 9 10
        print_1_to_N(10);
    }
}
