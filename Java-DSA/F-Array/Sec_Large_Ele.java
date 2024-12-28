public class Sec_Large_Ele {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 8, 9, 34, 56, 78, 9, 56, 3, 2, 34, 6, 89, 1 };
        int large = arr[0];
        int sec_large = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                sec_large = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > sec_large) {
                sec_large = arr[i];
            }
        }
        System.out.println("Second Large elemenr :" + sec_large);
    }
}
// Second Large elemenr :78