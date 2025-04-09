public class Arr_sort_or_not {

    public static boolean is_sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 16, 8, 9 };
        System.out.println(is_sorted(arr));
    }

}