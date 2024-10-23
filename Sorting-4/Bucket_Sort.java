import java.util.*;

public class Bucket_Sort {

    public static void bucketSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int[] buckets = new int[range];

        // Initialize buckets
        for (int i = 0; i < arr.length; i++) {
            buckets[arr[i] - min]++;
        }

        // Build sorted array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            while (buckets[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 6, 5, 1, 8, 3, 7 };

        System.out.println("Original Array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}