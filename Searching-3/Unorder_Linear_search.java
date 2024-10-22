public class Unorder_Linear_search {
    public static int linearSearch(int arr[], int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {// TC : O(N)
        int arr[] = { 2, 4, 7, 9, 5, 2, 4, 6, 8, 3, 1 }; // 1 ---> 10
        int res = linearSearch(arr, 1);
        System.out.println(res);
    }
}
