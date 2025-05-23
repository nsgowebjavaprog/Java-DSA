public class Max_Sum_Array {

    public static int maxSumArr(int arr[]) {
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, -1, 10, 23, 2 };
        System.out.println(maxSumArr(arr));
    }
}
