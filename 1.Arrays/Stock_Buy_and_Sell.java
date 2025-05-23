public class Stock_Buy_and_Sell {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - minPrice; // Calculate profit if sold today
            max_profit = Math.max(max_profit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}