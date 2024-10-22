public class Duplicates_In_array {
    public static int duplicateInArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[Math.abs(arr[i])] < 0) {
                return Math.abs(arr[i]);
            } else
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 5, 6, 7};
        int res = duplicateInArray(arr);
        System.out.println(res);
    }
}

