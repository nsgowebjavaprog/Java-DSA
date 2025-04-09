public class Rem_Duplications {

    public static int rem_duplicate_sort_arr(int arr[]) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 8, 3, 8, 34};
        System.out.println(rem_duplicate_sort_arr(arr));
    }

}
