public class Move_Zero_End {
    public static int moveAllZeroToend(int arr[]) {
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
                // swap(arr[i], arr[j]);
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 9, 0, 2, 5, 6, 0, 3, 4, 0 };
        int res = moveAllZeroToend(arr);
        System.out.println(res);
    }
}
