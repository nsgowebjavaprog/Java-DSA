public class N_Times {

    public static void print_N_Times(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n + ".NS LONI");
        print_N_Times(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        print_N_Times(n);
    }
}
