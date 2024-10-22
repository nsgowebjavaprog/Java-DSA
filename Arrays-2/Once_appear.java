public class Once_appear {
    public static int appearOnceinArray(int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5 }; // 3
        int res = appearOnceinArray(arr);
        System.out.println(res);
    }
}
// TC : O(N)