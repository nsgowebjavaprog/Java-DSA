public class Missing_Num {
    public static int missing_num(int arr[], int n) {
        int sum = n * (n - 1) / 2;
        int sum_arr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum_arr += arr[i];
        }
        return (sum - sum_arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 }; // 4
        int res = missing_num(arr, 5);
        System.out.println(res);
    }
}
