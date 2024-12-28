/* 
 Length of the Longest Consecutive 1s in Binary Representation
Last Updated : 01 Sep, 2023
Given a number N, The task is to find the length of the longest consecutive 1s series in its binary representation.
Examples : 


Input: N = 14
Output: 3
Explanation: The binary representation of 14 is 1110.


Input: N = 222
Output: 4
Explanation: The binary representation of 222 is 11011110.
*/

public class Len_Of_1_s {

    class Solution {

        /*
         * Function to calculate the longest consecutive ones
         * N: given input to calculate the longest consecutive ones
         */
        public static int maxConsecutiveOnes(int N) {

            int count = 0;
            // Count the number of iterations to
            // reach x = 0.
            while (N != 0) {
                // This operation reduces length
                // of every sequence of 1s by one.
                N = (N & (N << 1));

                count++;
            }
            return count;
        }
    }

}