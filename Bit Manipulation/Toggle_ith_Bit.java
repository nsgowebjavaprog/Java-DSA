public class Toggle_ith_Bit {
    public static void main(String[] args) {
        int n= 13;
        int i = 1;  // change only ith bit 0-->1 || 1 ---> 0

        n = n ^ (1<<i);

        System.out.println(n);
    }
}
