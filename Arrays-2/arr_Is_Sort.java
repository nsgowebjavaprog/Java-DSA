public class arr_Is_Sort {
    public static boolean check_arr_sortORnot(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// true
        // int arr[] = { 1, 2, 3, 4, 5, 55, 7, 8, 9 };//fa;se
        boolean res = check_arr_sortORnot(arr);
        System.out.println(res);
    }
}
// Time Complexity ; O(N)