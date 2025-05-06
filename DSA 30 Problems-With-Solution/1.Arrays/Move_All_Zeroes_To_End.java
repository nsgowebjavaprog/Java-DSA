class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return;
        }

        int j = 0; // Pointer for the next non-zero element
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        // No need to return the array, as it is modified in place
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums);

        // Print the modified array to verify the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}