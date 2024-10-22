public class Selection_Sort {

    public static void selectioSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // SWAP
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        // printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 4, 5, 6 };
        int n = 6;
        // System.out.println(selectioSort(arr, n));
        printArray(arr);
        selectioSort(arr, n);
        printArray(arr);
    }
}