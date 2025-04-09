import java.util.Arrays;

public class Left_rotate_n_place {

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] left_rotate_n_place(int arr[], int n) {
        int len = arr.length;
        n = n % len;

        if (n == 0) {
            return arr;
        }

        reverse(arr, 0, n - 1); // Reverse first 'n' elements
        reverse(arr, n, len - 1); // Reverse remaining 'len - n' elements
        reverse(arr, 0, len - 1); // Reverse the whole array

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 4;

        arr = left_rotate_n_place(arr, n);

        System.out.println("Array after left rotation by " + n + " positions:");
        System.out.println(Arrays.toString(arr));
    }
}