public class Move_All_Zero_End {

    public static void move_zero_to_end(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,4,7,3,0,2,7,0};
        move_zero_to_end(arr);
        System.out.print("Array after moving zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
    }
  }
}