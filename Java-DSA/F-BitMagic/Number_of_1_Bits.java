/*
 Count set bits in an integer
Last Updated : 11 Apr, 2023
 
Write an efficient program to count the number of 1s in the binary representation of an integer.
Examples : 


Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits


Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bits
 */

public class Number_of_1_Bits {

    class Solution {
        static int setBits(int n) {
            // code here
            int count = 0;

            while (n != 0) {
                int bit = n & 1;
                if (bit == 1) {
                    count++;
                }
                n = n >> 1;
            }
            return count;
        }
    }

}
