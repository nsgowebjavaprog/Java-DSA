/*
 Find the maximum subset XOR of a given set
Last Updated : 22 Jul, 2024
Given a set of positive integers. find the maximum XOR subset value in the given set. Expected time complexity O(n).

Examples:

Input: set[] = {2, 4, 5}
Output: 7
The subset {2, 5} has maximum XOR value

Input: set[] = {9, 8, 5}
Output: 13
The subset {8, 5} has maximum XOR value

Input: set[] = {8, 1, 2, 12, 7, 6}
Output: 15
The subset {1, 2, 12} has maximum XOR value

Input: set[] = {4, 6}
Output: 6
The subset {6} has maximum XOR value
 */

import java.util.Arrays;

public class Max_Sub_XOR {
    
    if(N == 0) return 0;
    int num = 0;
    while(true){
      int max = Integer.MIN_VALUE;
      for(int i=0;i<N;i++){
          if(max<arr[i]) max=arr[i];
      }
      if(max == 0) return num;
      num = Math.max(num,num^max);
      for(int i=0;i<N;i++){
        arr[i] = Math.min(arr[i],arr[i]^max);
      }
    }

    // ------------------------------------0R-------------------
    class Solution
{
    public static int maxSubsetXOR(int arr[], int N)
    {
        if (N == 0) return 0;

        int num = 0;
        while (true) {
        int max = Arrays.stream(arr).max().getAsInt();
        if (max == 0) return num;
        num = Math.max(num, num ^ max);
        for (int i = 0; i < N; i++) {
        arr[i] = Math.min(arr[i], arr[i] ^ max);
       }
     }
   }
}

}
