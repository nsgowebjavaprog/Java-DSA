public class left_rotate_by_one {
    public static void leftRotateArrayByonePlace(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(leftRotateArrayByonePlace(arr));
    }
}
