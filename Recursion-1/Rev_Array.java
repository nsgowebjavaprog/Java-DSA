//Print reverse An Array
public class Rev_Array {
    public static void rev_array(int arr[]) {
        // int arr[] = {1,2,3,4,56,7,8,9};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            // Swap

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Increment & Decrement

            left++;
            right--;
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 10 9 8 7 6 5 4 3 2 1
        rev_array(arr);
        display(arr);
    }
}
