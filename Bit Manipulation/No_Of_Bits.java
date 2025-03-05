public class No_Of_Bits {
    public static void main(String[] args) {
        int count = 0;
        int n = 10;
        while (n > 0) {
            count += n & 1;
            n = n / 2;
        }
        System.out.println(count);
    }
}
