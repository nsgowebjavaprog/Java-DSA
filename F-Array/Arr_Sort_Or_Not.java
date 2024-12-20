public class Arr_Sort_Or_Not {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 8, 9, 34, 56, 78, 9, 56, 3, 2, 34, 6, 89, 1 };
        Arr_Sort_Or_Not obj = new Arr_Sort_Or_Not();
        boolean result = obj.isSorted(arr);
        System.out.println("Is array sorted: " + result);
    }

    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
