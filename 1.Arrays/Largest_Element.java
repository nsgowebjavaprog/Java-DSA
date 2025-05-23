public class Largest_Element {
    public static int findLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, 3, 4, 5 };
        System.out.println("Largest element is: " + findLargest(arr));
    }
}
