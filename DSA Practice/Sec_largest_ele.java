public class Sec_largest_ele {

    public static int find_2_max_ele(int arr[]) {
        int max = arr[0];
        int sec_max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }
        return sec_max;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 56, 2, 67, 21, 67, 23, 95, 32, 45, 5, 68 };
        System.out.println(find_2_max_ele(arr));
    }
}
