public class Second_Large_Number {

    public static int findSecondLargest(int arr[]) {
        int largest = arr[0];
        int sec_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            }

            else if (arr[i] < largest && arr[i] > sec_largest) {
                sec_largest = arr[i];
            }
        }
        return sec_largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, 3, 4, 5 };
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }
}
