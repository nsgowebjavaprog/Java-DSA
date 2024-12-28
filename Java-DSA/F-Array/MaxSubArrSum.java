public class MaxSubArrSum {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add the current element to the sum
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0; // Reset the sum if it becomes negative
            }
        }
        System.out.println(max);
    }
}
// 7