class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n = arr.length + 1;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i];
        }
        int tot_sum = (n * (n + 1)) / 2;
        return tot_sum - sum;
    }
}