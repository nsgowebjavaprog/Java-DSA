/*
 Rightmost different bit
Difficulty: EasyAccuracy: 61.61%Submissions: 118K+Points: 2
Given two numbers m and n. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both m and n are the same then return -1 in this case.

Examples: 

Input: m = 11, n = 9
Output: 2
Explanation: Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.
Input: m = 52, n = 4
Output: 5
Explanation: Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different.
Input: m = 29, n = 15
Output: 4
Explanation: Binary representation of the given numbers are: 29 in binary is 11101, 15 in binary is 01111. The 4th bit from the right is different.
 */

public class 2_ Right_Most_Diff_Bit{

class Solution {
    // Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {

        int xor = m ^ n;
        if (xor == 0) {
            return -1;
        }
        int pos = xor & ((~xor) + 1);
        return (int) (Math.log(pos) / Math.log(2)) + 1;

    }
}

}
