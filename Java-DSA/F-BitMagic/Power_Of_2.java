/*
 Program to find whether a given number is power of 2
Last Updated : 16 Jul, 2024
Given a positive integer n, write a function to find if it is a power of 2 or not

Examples: 

Input : n = 4
Output : Yes
Explanation: 22 = 4


Input : n = 42
Output : No
Explanation: 42 is not a power of 2


Input : n = 1
Output : Yes
Explanation: 20 = 1
 */



public class Power_Of_2 {

    class Solution {
        // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(int n) {
            // code here
            return n != 0 && ((n & (n - 1)) == 0);
        }
    }
    
}
