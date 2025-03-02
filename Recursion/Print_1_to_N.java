public class Print_1_to_N {
    public static void func(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        func(i + 1, n);
    }

    public static void main(String args[]) {
        int n = 6;
        func(1, n);
    }
}