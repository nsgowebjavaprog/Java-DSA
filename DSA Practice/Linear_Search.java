public class Linear_Search {

    public static int Linear_Search(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Linear_Search(arr, 3)); // Output: 2
    }
}