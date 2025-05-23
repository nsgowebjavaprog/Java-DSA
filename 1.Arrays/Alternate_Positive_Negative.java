public class Alternate_Positive_Negative {
    public static void rearrange(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0, pos = 0, neg = 1; i < arr.length; i++) {
            if (arr[i] >= 0 && pos < arr.length) temp[pos++] = arr[i];
            else if (arr[i] < 0 && neg < arr.length) temp[neg++] = arr[i];
            pos += (arr[i] >= 0) ? 1 : 0;
            neg += (arr[i] < 0) ? 1 : 0;
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8};
        rearrange(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}