//Print "N" to 1
public class Print_N_to_1 {
    public static void print_N_to_1(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            print_N_to_1(n - 1);
        }
        return;
    }

    public static void main(String[] args) {// 10 9 8 7 6 5 4 3 2 1
        print_N_to_1(10);
    }
}
