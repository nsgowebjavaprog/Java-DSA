public class Move_Zero_To_End {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0, 6, 0, 8 };

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
