public class Wave_Array {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void convertToWave(int[] arr, int n) {
        // Traverse all even indexed elements
        for (int i = 0; i < n - 1; i = i + 2) {
            swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        convertToWave(arr, n);

        System.out.println("\nWave array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Original array:
// 1 2 3 4 5 6
// Wave array:
// 2 1 4 3 6 5