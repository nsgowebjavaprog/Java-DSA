public class Two_Sum {
    public static int twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int res = twoSum(arr, 14);
        if (res != null) {
            System.out.println("yeas");
        } else {
            System.out.println("no");
        }
    }
}
