/*
 Check whether K-th bit is set or not
Last Updated : 18 Feb, 2023
Given a number N and a bit number K, check if the Kth bit of N is set or not. A bit is called set if it is 1. 
Note: Indexing starts with 0 from LSB (least significant bit) side in the binary representation of the number.

Examples: 


Input: n = 5, k = 1
Output: NOT SET
Explanation: 5 is represented as 101 in binary and bit at position 1 is not set


Input: n = 2, k = 3
Output: NOT SET
Explanation: 2 is represented as 10 in binary, all higher i.e. beyond MSB, bits are NOT SET.
 */

public class 3_ Check_Kth_Ele_Set_or_Not{
class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }
}}
