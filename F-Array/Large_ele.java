public class Large_ele {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 89, 4, 2, 6, 34, 3 };
        int large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("Large element is: " + large);
    }
}
// Large element is: 89