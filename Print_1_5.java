public class Print_1_5 {
    public static void print_number(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n + "\t"); // 1 2 3 4 5
        print_number(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        print_number(n);
    }
}
