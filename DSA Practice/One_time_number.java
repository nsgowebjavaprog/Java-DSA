public class One_time_number {

    public static int findOneTimeNumber(int arr[]) {
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(findOneTimeNumber(arr));
    }

}