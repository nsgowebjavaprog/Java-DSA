public class Reverse_Array_in_Groups {

    public static void reverseInGroups(int arr[], int n, int k) {
        // Traverse the array in chunks of size k
        for (int i = 0; i < n; i += k) {
            // Calculate the end index for the current chunk
            int end = Math.min(i + k - 1, n - 1);
            // Reverse the current chunk
            reverse(arr, i, end);
        }
    }
    private static void reverse(int arr[], int start, int end) {
        // Swap elements from start to end until they meet in the middle
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3; // Size of each group to reverse
        reverseInGroups(arr, arr.length, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }       
    }
}