// Give Array is strickly Increasing Order or Not.
public class Sort_Arr_Or_Not {
    public static boolean check(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return check(arr, idx + 1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) { // true
        int arr[] = { 1, 2, 3, 45, 55 };
        System.out.println(check(arr, 0));
    }
}
