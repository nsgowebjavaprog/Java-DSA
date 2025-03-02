public class Fibonnanci {
    public static int func(int n) {
        if (n <= 1)
            return n;
        int last = func(n - 1);
        int sec_last = func(n - 2);

        return last + sec_last;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(func(10));
    }

}
