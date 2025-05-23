public class Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements to process
        }

        int unique_number_count = 1; // Start with the first element as unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare current element with the previous one
                nums[unique_number_count] = nums[i]; // Update the array in place
                unique_number_count++; // Increment the count of unique numbers
            }
        }

        return unique_number_count; // Return the count of unique numbers
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
