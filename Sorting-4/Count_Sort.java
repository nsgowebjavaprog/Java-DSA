import java.util.*;
public class Count_Sort {
    public static void countSort(int[] arr) {
      
        //Find MAX
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        // Find MiN
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min + 1;
        int[] count = new int[range];

    // Count occurrences
    for (int num : arr) {
        count[num - min]++;
    }
    // Calculate cumulative count
    for (int i = 1; i < count.length; i++) {
        count[i] += count[i - 1];
    }
    // Build output array
    int[] output = new int[arr.length];
    for (int num : arr) {
        output[--count[num - min]] = num;
    }
    // Copy sorted elements
    System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };

        System.out.println("Original Array:");
        printArray(arr);

        countSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}