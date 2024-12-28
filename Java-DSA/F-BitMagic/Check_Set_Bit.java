/*
 Check set bits
Difficulty: BasicAccuracy: 52.59%Submissions: 30K+Points: 1
Given a number N. You have to check whether every bit in the binary representation of the given number is set or not.

Example 1:

Input:
N = 7
Output:
1
Explanation:
Binary for 7 is 111 all the
bits are set so output is 1
Example 2:

Input:
N = 8
Output:
0
Explanation:
Binary for 8 is 1000 all the
bits are not set so output is 0.
 */

public class Check_Set_Bit {
    
    class Solution{
        static int isBitSet(int N){
            //code here
            if(N==0){
                return 0;
            }else{
                while(N>0){
                    if((N&1) == 0){
                        return 0;
                    }else{
                        N = N>>1;
                    }
                }
            }
            return 1;
        }
    }

}
