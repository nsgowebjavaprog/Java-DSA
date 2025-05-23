public class Sort_0s_1s_2s {
    public static void sortByZeroOneTwos(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 0, 1, 2, 1, 2, 0, 0, 1 };
        sortByZeroOneTwos(arr);
        for (int n : arr)
            System.out.print(n + " ");
    }
}