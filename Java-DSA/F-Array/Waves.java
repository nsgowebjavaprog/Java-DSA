// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
// Input: arr[] = [2, 4, 7, 8, 9, 10]
// Output: [4, 2, 8, 7, 10, 9]
// Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.

class Solution {
    public static void convertToWave(int[] arr) {
        // code here
        int i = 0;
        while(i<arr.length-1){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        i+=2;
        }
    }
}

/*
public class Waves {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 78, 5};

        // Create the waveform pattern
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Print the array in waveform pattern
        System.out.print("Array in Waveform Pattern: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

*/