public class Linear_Search {
    public static int linear_search(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 5;
        System.out.println("Position ==> " + linear_search(arr, num));
    }
}
