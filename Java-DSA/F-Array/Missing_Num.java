public class Missing_Num {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int sum_arr = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_arr += arr[i];
        }
        System.out.println("Missing Number is: " + (sum - sum_arr));
    }
}
// Missing Number is: 3

// Time Complexity: O(n)
// Space Complexity: O(1)