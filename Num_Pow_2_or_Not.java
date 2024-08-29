public class Num_Pow_2_or_Not {
    public static void main(String[] args) {
        // power of nums
        // 1 --> 1
        // 2 --> 1 0
        // 4 --> 1 0 0
        // 8 --> 1 0 0 0
        // 16 -->1 0 0 0 0
        // 32 -->1 0 0 0 0 0
        // 64 -->1 0 0 0 0 0 0
        // 128-->1 0 0 0 0 0 0 0

        // Logic: n = (n &(n-1) == 0)
        // 1 0 0 0 0
        // AND
        // 0 1 1 1 1
        // ------------
        // 0 0 0 0 0

        int a = 10; // Not
        int b = 32; // Yes

        if ((a & (a - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
        if ((b & (b - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
    }
}
