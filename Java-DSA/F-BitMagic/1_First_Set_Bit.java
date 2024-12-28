/*
 First Set Bit
Difficulty: EasyAccuracy: 46.89%Submissions: 171K+Points: 2
Given an integer n. The task is to return the position of the first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.  

Examples:

Input: n = 18
Output: 2
Explanation: Binary representation of 18 is 010010,the first set bit from the right side is at position 2.
Input: n = 12
Output: 3 
Explanation: Binary representation of  12 is 1100, the first set bit from the right side is at position 3.
Input: n = 1
Output: 1
Explanation: Binary representation of  1 is 1, the first set bit from the right side is at position 1.
 */

public class 1_ First_Set_Bit{
class Solution {
    // Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n) {

        // Your code here
        if (n == 0) {
            return 0;
        }
        int pos = 1;
        while ((n & 1) == 0) {
            n = n >> 1;
            pos++;
        }
        return pos;
    }
}}
