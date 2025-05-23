public class Third_Largest_Element {

    // Function to return the third largest unique element from the array
    public static int getThirdLargest(int[] arr, int n) {
        // If there are fewer than 3 elements, return -1
        if (n < 3) {
            return -1;
        }

        // Initialize first, second, and third largest elements to the smallest possible
        // value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Traverse the array to find the top three unique largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                // Shift down: first → second, second → third
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                // Shift down: second → third
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] < second) {
                // Update third if it's less than arr[i] and arr[i] < second
                third = arr[i];
            }
        }

        // If third wasn't updated (i.e., not enough unique elements), return -1
        return third == Integer.MIN_VALUE ? -1 : third;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;

        // Output the result
        System.out.println("Third largest element is: " + getThirdLargest(arr, n));
    }
}

// ### ✅ **Time Complexity:**

// * **O(n)** — The array is traversed only once, making it linear in time.

// ### ✅ **Space Complexity:**

// * **O(1)** — Only three variables are used (`first`, `second`, `third`)