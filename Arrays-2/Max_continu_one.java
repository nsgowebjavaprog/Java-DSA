public class Max_continu_one {
    public static int Max_continu_one_arr(int arr[]) {
        int max1 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max1 = max(max1, count);
            } else {
                count = 0;
            }
        }
        return max1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1 };
        int res = Max_continu_one_arr(arr);
        System.out.println(res);
    }
}
