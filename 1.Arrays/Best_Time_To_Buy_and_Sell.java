public class Best_Time_To_Buy_and_Sell {
    public static int buy_sell_stock(int arr[]) {
        int mini = arr[0];
        int maxm = 0;

        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i] - mini;
            maxm = Math.max(maxm, cost);
            mini = Math.min(mini, arr[i]);
        }
        return maxm;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 3, 5, 7, 3, 26, 2 };
        System.out.println(buy_sell_stock(arr));
    }
}