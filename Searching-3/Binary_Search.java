/**
 * Binary_Search
 */
public class Binary_Search {
    public static int binarysearch(int arr[], int low, int high, int data) {
        int mid = low + (high - low) / 2;
        if (low > high)
            return -1;

        if (arr[mid] == data)
            return mid;

        else if (arr[mid] < data)
            return binarysearch(arr, mid + 1, high, data);
        else
            return binarysearch(arr, low, mid - 1, data);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 8, 9, 10, 14, 15, 23, 25, 45, 56, 67, 78 };
        int res = binarysearch(arr, 0, arr.length - 1, 23);// ------------------------> 9[idx]
        System.out.println(res);
    }
}