public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 2, 0, 0, 0, 0, 2, 1, 1, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 0};
        int[] count = new int[3];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 2) {
                count[arr[i]]++;
            }
        }

        System.out.println("Count of 0s: " + count[0]);
        System.out.println("Count of 1s: " + count[1]);
        System.out.println("Count of 2s: " + count[2]);
    }
}
