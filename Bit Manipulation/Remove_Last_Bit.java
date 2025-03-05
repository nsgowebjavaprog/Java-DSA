public class Remove_Last_Bit {
    public static void main(String[] args) {
        int n = 15;

        // Remove last bit from rigght <--- left
        n = n & n - 1;
        System.out.println(n);
    }
}
