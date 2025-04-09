public class Largest_ele {

    public static int find_max_ele(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 8, 3, 8, 34, 2 };
        int max_1 = find_max_ele(arr);
        System.out.println("Largest element in the array is: " + max_1);
    }
}
