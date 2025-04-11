import java.util.*;

public class In_each_Range_Count_each_Number {

    public static int[] countRanges(int[][] ranges, int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int[] range : ranges) {
                if (nums[i] >= range[0] && nums[i] <= range[1]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] ranges = {
                { 2, 7 },
                { 4, 9 },
                { 1, 7 }
        };
        int[] nums = { 4, 8, 5, 3, 8, 4, 1 };

        int[] result = countRanges(ranges, nums);
        System.out.println(Arrays.toString(result)); // Output: [3, 1, 3, 2, 1, 3, 1]
    }
}