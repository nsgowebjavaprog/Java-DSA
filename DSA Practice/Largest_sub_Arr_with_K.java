public class Largest_sub_Arr_with_K {

    public static int largestSubArrayWithK(int arr[], int k) {
        int start = 0, sum = 0, maxLength = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > k) {
                sum -= arr[start++];
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 4, 23, 6, 56, 3, 4, 5, 67, 42, 2 };
        System.out.println(largestSubArrayWithK(arr, 79));
    }
}