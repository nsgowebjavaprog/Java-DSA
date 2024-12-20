import java.util.*;

// Array Subset
// Difficulty: BasicAccuracy: 44.05%Submissions: 387K+Points: 1
// Given two arrays: a[] and b[], where both arrays may contain duplicate elements. The task is to determine whether array b is a subset of array a. It's important to note that both arrays can be unsorted. Additionally, each occurrence of a duplicate element within an array is considered as a separate element of the set.

// Examples:

// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: Yes
// Explanation: b[] is a subset of a[] 

// Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
// Output: Yes
// Explanation: b[] is a subset of a[]

// Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
// Output: No
// Explanation: b[] is not a subset of a[]

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);

        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}