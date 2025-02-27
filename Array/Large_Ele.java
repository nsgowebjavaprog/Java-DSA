import java.util.Arrays;

public class Large_Ele {
    public static void main(String[] args) {
        // 1 Brute Solution
        /*
         * int arr[] = { 1, 2, 3, 4, 5, 23,4,23,4,13,54345,232,11};
         * 
         * Arrays.sort(arr);
         * System.out.println(arr[arr.length-1]);
         * 
         */
        // 2. Better -- No Solution

        // 3. Optimal
        int arr[] = { 1, 2, 3, 4, 5, 23, 4, 23, 4, 13, 54345, 232, 11 };
        int largest_ele = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest_ele) {
                largest_ele = arr[i];
            }
        }
        System.out.println(largest_ele);

    }

}
