public class Print_N_to_1 {
    public static void func(int i, int n) {
        if (i < 1)
            return;

        System.out.println(i);
        func(i - 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        func(n, 1);
    }

}
