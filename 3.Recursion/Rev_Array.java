public class Rev_Array {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return; // base case
        }

        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10,1,2,3,4};

        reverseArray(arr, 0, arr.length - 1);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
