public class Rem_Duplicates {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 8, 9, 34, 34, 56, 78, 9, 56, 3, 2, 34, 6, 89, 1 };

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Array without duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
