import java.io.*;
import java.util.HashMap;

public class Two_2_Sum {

    public static int two_sum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int res = target - arr[i];

            if (map.containsKey(res)) {
                return map.get(res);
            }
            map.put(arr[i], i);
        }
        return -1;

        

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        // int res = target - nums[i];

        // if (map.containsKey(res)) {
        // return new int[]{map.get(res), i};
        // }
        // map.put(nums[i], i);
        // }
        // return new int[] {-1, -1};

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;
        System.out.println(two_sum(arr, target));
    }

}