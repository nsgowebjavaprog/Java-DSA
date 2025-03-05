public class Set_ith_Bit {
    public static void main(String[] args) {
        int n = 9;
        int i = 2;

        n = n | (1 << i);
        System.out.println(n);
    }
}
// 9 ---> 1 0[1] 0 1 --> 1 1 0 1 --> 13