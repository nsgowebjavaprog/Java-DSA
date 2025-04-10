public class Max_sum_Non_adj_Or_House_Robber {

    public static int house_robber(int arr[]) {

        if (arr.length == 0)
            return 0;

        if (arr.length == 1)
            return arr[0];

        
            // int prev = 0, curr = 0;

        // for (int num : arr) {
        // int temp = Math.max(curr, prev + num);
        // prev = curr;
        // curr = temp;
        // }

        // return curr;



        return Math.max(getMax(arr, 0, arr.length - 2), getMax(arr, 1, arr.length - 1));
    }

    private static int getMax(int arr[], int start, int end) {
        int prev_num = 0;
        int max_num = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(max_num, prev_num + arr[i]);
            prev_num = max_num;
            max_num = temp;
        }
        return max_num;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 9 };
        System.out.println(house_robber(arr));
    }
}