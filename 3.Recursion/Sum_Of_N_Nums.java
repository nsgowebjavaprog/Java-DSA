public class Sum_Of_N_Nums {

    public static void SumOf1toN(int n, int sum) {
        if (n == 11) {
            System.out.println(sum);
            return;
        }
        SumOf1toN(n + 1, sum + n);
    }

    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        SumOf1toN(n, sum);
    }
}
