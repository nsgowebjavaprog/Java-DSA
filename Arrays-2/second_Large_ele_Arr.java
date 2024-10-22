public class second_Large_ele_Arr {
    public static int second_Large_ele(int arr[]) {
        int largest = arr[0];
        int sec_large = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec_large = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sec_large) {
                sec_large = arr[i];
            }
        }
        return sec_large;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 6, 9, 10, 4};
        int res = second_Large_ele(arr);
        System.out.println(res);
    }
}
// 9
// Time Complexity : O(N)