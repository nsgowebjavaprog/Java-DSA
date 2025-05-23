public class Left_rotate_N_Place {

    public static void l_rotate_by_n_place(int arr[], int place) {
        int n = arr.length;
        place = place % n;

        reverse(arr, 0, place - 1);
        reverse(arr, place, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int d = 3;
        l_rotate_by_n_place(arr, d);
        System.out.print("n-place rotate --> ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
