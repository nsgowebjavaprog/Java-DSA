import java.sql.Array;
import java.util.Arrays;

public class Unique_Paths__Grid {

    public static int uniq_path(int m, int n) {
        int dp[] = new int[n];

        dp[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniq_path(m, n));
    }
}