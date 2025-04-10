public class Climbing_Stairs {

    public static int clim_stairs(int n) {
        // Create a DP
        int dp[] = new int[n + 1];

        if (n == 0 || n == 1) {
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];



        // int prev1 = 2; // dp[2]
        // int prev2 = 1; // dp[1]
        // int curr = 0;

        // for (int i = 3; i <= n; i++) {
        // curr = prev1 + prev2;
        // prev2 = prev1;
        // prev1 = curr;
        // }

        // return prev1;

        
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(clim_stairs(n));
    }
}
// ✅ Time Complexity = O(n)

// ✅ Space Complexity = O(n)

// Output = 8