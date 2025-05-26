class Print_1_to_N {

    public static void print_1_To_N(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print_1_To_N(i + 1, n);
    }

    public static void main(String args[]) {
        int n = 10;
        print_1_To_N(1, n);
    }
}