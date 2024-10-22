// Total Sum 1 to "N".
public class Sum_1_to_N {
    public static void sum_all(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum_all(i + 1, n, sum);
    }

    public static void main(String[] args) { // 55
        sum_all(1, 10, 0);
    }
}
