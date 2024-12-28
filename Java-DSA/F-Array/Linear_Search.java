public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0, 6, 0, 8 };
        int num = 12;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
// Element found at index 4