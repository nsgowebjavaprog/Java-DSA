public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };
        int target = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices of two elements that add up to " + target + ": [" + i + ", " + j + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No solution found");
        }
    }
}

// Indices of two elements that add up to 3: [0, 2]
// Indices of two elements that add up to 3: [0, 3]
// Indices of two elements that add up to 3: [1, 2]
// Indices of two elements that add up to 3: [1, 3]