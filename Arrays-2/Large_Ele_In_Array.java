public class Large_Ele_In_Array {
    public static int large_ele_arr(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 7, 9, 5, 8, 10, 3 };
        int res = large_ele_arr(arr);
        System.out.println(res);
    }
}
// 10
// Time complexity : O(N)