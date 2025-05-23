public class Rem_Dup_From_Sorted_Array {

    public static int removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; // Length of array after removing duplicates
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };

        int newLength = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLength of array after duplicates removed: " + newLength);
    }
}