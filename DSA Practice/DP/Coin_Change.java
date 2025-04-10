public class Coin_Change {

    public static int coins_changes(int ammount, int coins[]) {
        int dp[] = new int[ammount + 1];

        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= ammount; i++) {
                dp[i] = dp[i] + dp[i - coin];
            }
        }
        return dp[ammount];
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5 };
        int ammount = 5;
        System.out.println(coins_changes(ammount, coins));
    }
}
