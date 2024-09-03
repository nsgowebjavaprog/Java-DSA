public class Insertion_Sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) { // 1 2 3 7 8
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArr(arr);
    }
}
