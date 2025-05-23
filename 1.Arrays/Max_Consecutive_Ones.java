public class Max_Consecutive_Ones {

    // Function to return the length of the longest contiguous sequence of 1s
    public static int findMaxConsecutiveOnes(int nums[]) {
        int max_count = 0; // Stores the maximum count of consecutive 1s
        int counts = 0; // Temporary count of current sequence of 1s

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counts++; // Increase current streak of 1s
                max_count = Math.max(max_count, counts); // Update max if needed [OPTIONAL -- NS LONI]
            } else {
                counts = 0; // Reset count on encountering 0
            }
        }

        return max_count;
    }

    // Main method to test the logic
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums));
    }
}

// ### ✅ **Time Complexity:**

// * **O(n)** — One full pass through the array.

// ### ✅ **Space Complexity:**

// * **O(1)** — Uses only two integer variables for tracking counts.