public class Left_Rotate_By_1 {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 8, 9, 34, 34, 56, 78, 9, 56, 3, 2, 34, 6, 89, 1 };
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// 7 8 9 34 34 56 78 9 56 3 2 34 6 89 1 3