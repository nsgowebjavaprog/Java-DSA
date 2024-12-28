/*
 Toggle bits in the given range
Last Updated : 01 Apr, 2024
Given a non-negative number n and two values l and r. The problem is to toggle the bits in the range l to r in the binary representation of n, i.e., to toggle bits from the lth least significant bit bit to the rth least significant bit (the rightmost bit as counted as first bit). A toggle operation flips a bit 0 to 1 and a bit 1 to 0.
Constraint: 1 <= l <= r <= number of bits in the binary representation of n.
Examples: 

Input: n = 17, l = 1, r = 3
Output: 22
Explanation: (17)10 = (10001)2
                       (22)10 = (10110)2
The bits in the range 1 to 3 in the binary representation of 17 are toggled.



Input: n = 50, l = 2, r = 5
Output: 44



Explanation: (50)10 = (110010)2
                       (44)10 = (101100)2
The bits in the range 2 to 5 in the binary representation of 50 are toggled.
 */

public class Toggle_Bit_in_Given_Range {

    class Solution {
        static int toggleBits(int n, int l, int r) {
            // code here
            int res = ((1 << r) - 1) - ((1 << (l - 1)) - 1);
            return n ^ res;
        }
    };

}