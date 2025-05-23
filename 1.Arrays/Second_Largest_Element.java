class Second_Largest_Element {

    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int first = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {

                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {

                second = arr[i];
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };

        System.out.println("Second largest element is: " + getSecondLargest(arr));
    }
}