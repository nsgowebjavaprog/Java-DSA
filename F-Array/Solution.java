/* Better for Platform 

import java.util.ArrayList;
import java.util.List;

public class Move_Neg_Val_to_End {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int arr[] = { 1, 3, 5, 7, -3, -4, 4, 3, 2, -2, -6 };

        List<Integer> s = new ArrayList<>();
       
        for (int i : arr) {
            if (i >= 0) {
                s.add(i);
            }
        }
        for (int i : arr) {
            if (i < 0) {
                s.add(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.get(i);
        }
        System.out.println("Arr :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }
}

*/

public class Solution {
    public void moveNegativesToLast(int[] arr) {
        int j = 0; // Pointer to track the position where the next non-negative number should be placed

        // Iterate through the array to move all non-negative numbers to the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Increment j to point to the next position for the next non-negative number
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        solution.moveNegativesToLast(arr);

        // Print the array after moving negatives to the end
        System.out.println("Array after moving negatives to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
