public class Bubble_Sort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // B-B Sort
    public static void bbSort(int arr[], int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 4, 8, 7 };
        System.out.print("Orignal arr is:");
        printArray(arr);
        bbSort(arr, arr.length);
        System.out.print("Result is:");
        printArray(arr);
    }
}
// Orignal arr is:2 5 1 4 8 7
// Result is:1 2 4 5 7 8