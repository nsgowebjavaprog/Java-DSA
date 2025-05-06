class Second_Largest_Element {

    // Function to get the second largest element from the array
    public static int getSecondLargest(int[] arr, int n) {
        // If array has fewer than 2 elements, return -1
        if (n < 2) {
            return -1;
        }

        // Initialize the first largest with first element and second largest with smallest possible value
        int first = arr[0];
        int second = Integer.MIN_VALUE;

        // Traverse the array to find the first and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                // If current element is greater than the largest so far, update both first and second
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                // If current is less than first but greater than second, update second
                second = arr[i];
            }
        }

        // If second was not updated, return -1 (i.e., all elements are equal or only one unique element)
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    // Main method to test the logic
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;

        // Output the result
        System.out.println("Second largest element is: " + getSecondLargest(arr, arr.length));
    }
}


// ### ✅ **Time Complexity:**

// * **O(n)** — We iterate through the array only once to find the first and second largest elements.

// ### ✅ **Space Complexity:**

// * **O(1)** — No extra space is used other than a few variables (`first`, `second`), regardless of input size.
