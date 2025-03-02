public class Rev_Array {
    public static void print_arr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void rev_arr(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            rev_arr(arr, start + 1, end - 1);

        }
    }

    public static void main(String args[]) {
        int n = 10;
        int arr[] = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3 };
        rev_arr(arr, 0, n - 1);
        print_arr(arr, n);
    }
}