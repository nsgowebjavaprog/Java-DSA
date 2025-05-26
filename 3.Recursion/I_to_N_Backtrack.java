public class I_to_N_Backtrack {

    public static void print_1_to_N_Backtrack(int n) {
        if (n == 0) {
            return;
        }
        print_1_to_N_Backtrack(n - 1); // function call before printing
        System.out.println(n);  // here back-Track logic / step
    }

    public static void main(String[] args) {
        int n = 10;
        print_1_to_N_Backtrack(n);
    }
}