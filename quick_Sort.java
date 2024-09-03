public class quick_Sort {
    // Partition
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) { // TC: worst---> O(n^2)
            if (arr[j] < pivot) { // ------> Avg: O(n logn)
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    // Q_Sort
    public static void q_sort(int arr[], int low, int high) {
        if (low < high) {
            int piot_inx = partition(arr, low, high);
            q_sort(arr, low, piot_inx - 1);
            q_sort(arr, piot_inx + 1, high);
        }
    }

    // Main
    public static void main(String[] args) { // 2 3 5 6 8 9
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        q_sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
