/*
 Reverse actual bits of the given number
Last Updated : 12 Apr, 2023
Given a non-negative integer n. The problem is to reverse the bits of n and print the number obtained after reversing the bits. Note that the actual binary representation of the number is being considered for reversing the bits, no leadings 0’s are being considered.
Examples : 
 


Input : 11
Output : 13
Explanation: (11)10 = (1011)2.
After reversing the bits we get:
(1101)2 = (13)10.


Input : 10
Output : 5
Explanation : (10)10 = (1010)2.
After reversing the bits we get:
(0101)2 = (101)2
        = (5)10.
 */




public class Rev_Bits {

    class Solution
{
    public int reverseBits(int n)
    {
        int ans = 0;
        while (n > 0) {
            ans = (ans << 1) | (n & 1);
            n >>= 1;
        }
        return ans;
    }
}
    
}
