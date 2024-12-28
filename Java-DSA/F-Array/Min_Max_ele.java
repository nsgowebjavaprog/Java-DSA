public class Min_Max_ele {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 54, 3, 2, 53, 756, 454, 3, 234, 56778, 6, 532, 623, 1 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max :" + max);
    }
}
