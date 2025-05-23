public class Rotate_Array_by_K_positions {

    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n

        // Reverse the first part of the array
        reverse(arr, 0, n - k - 1);
        // Reverse the second part of the array
        reverse(arr, n - k, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nRotated array: ");
        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
