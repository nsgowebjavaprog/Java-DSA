public class Missing_Number {

    public static int findMissingNumber(int arr[]) {
        int n = arr.length;

        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 5 };
        System.out.println(findMissingNumber(arr));
    }
}