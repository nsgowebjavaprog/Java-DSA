public class Toggle_ith_Bit {
    public static void main(String[] args) {
        // Toggle means--> 0-->becomes -->1
        // And 1-->becomes -->0
        // N = 13 i=2 --> 1 1 0 1----> 1 0 0 1
        // N = 9 i=2 --> 1 0 0 1--> 1 1 0 1
        // 1 << i----> XOR
        // N = 13 i=2 --> 1 1 0 1
        // 1 << i-> XOR-> 0 1 0 0
        // Answer for---> 1 1 0 1
        // LOGIC------------> n =(n^(1<<i))

        int n = 13; // Result:9
        int i = 2;
        n = (n ^ (1 << i));
        System.out.println("Result:" + n);
    }
}
// OUTPUT

// Result:9