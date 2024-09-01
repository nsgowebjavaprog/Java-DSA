public class Print_5_1 {
    public static void print_Number(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + "\t"); // 10 9 8 7 6 5 4 3 2 1
        print_Number(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        print_Number(n);
    }
}
