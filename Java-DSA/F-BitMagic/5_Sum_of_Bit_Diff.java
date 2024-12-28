/*
 Sum of bit differences
Difficulty: MediumAccuracy: 60.03%Submissions: 53K+Points: 4
Given an array integers arr[], containing n elements, find the sum of bit differences between all pairs of element in the array. Bit difference of a pair (x, y) is the count of different bits at the same positions in binary representations of x and y.
For example, bit difference for 2 and 7 is 2. Binary representation of 2 is 010 and 7 is 111 respectively and the first and last bits differ between the two numbers.

Note: (x, y) and (y, x) are considered two separate pairs.

Example 1:

Input: 
n = 2
arr[] = {1, 2}
Output: 4
Explanation: All possible pairs of an array are (1, 1), (1, 2), (2, 1), (2, 2).
Sum of bit differences = 0 + 2 + 2 + 0
                       = 4
Example 2:

Input:
n = 3 
arr[] = {1, 3, 5}
Output: 8
Explanation: 
All possible pairs of an array are (1, 1), (1, 3), (1, 5), (3, 1), (3, 3) (3, 5),(5, 1), (5, 3), (5, 5).
Sum of bit differences = 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 
                       = 8
 */

public class 5_ Sum_of_Bit_Diff{

class Solution {
    long sumBitDifferences(int[] arr, int n) {

        int ans = 0;
        for (int i = 0; i < 32; i++) {

            int count = 0;
            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count++;

            ans += (count * (n - count) * 2);
        }
        return ans;
    }
}

}