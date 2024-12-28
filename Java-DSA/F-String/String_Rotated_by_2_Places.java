/*
                       3. String_Rotated_by_2_Places
Difficulty: EasyAccuracy: 32.7%Submissions: 235K+Points: 2
Given two strings s1 and s2. Return true if the string s2 can be obtained by rotating (in any direction) string s1 by exactly 2 places, otherwise, false.

Examples:

Input: s1 = "amazon", s2 = "azonam"
Output: true
Explanation: "amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".

Input: s1 = "geeksforgeeks", s2 = "geeksgeeksfor"
Output: false
Explanation: If we rotate "geeksforgeeks" by two place in any direction, we won't get "geeksgeeksfor".

Input: s1 = "ab", s2 = "ab"
Output: false
 */

public class String_Rotated_by_2_Places {
        // Function to check if a string can be obtained by rotating
        // another string by exactly 2 places.
        public static boolean isRotated(String s1, String s2) {
            // Your code here
            int n=s1.length();
            if(n!=s2.length() | n==1)return false;
            
            String temp1=s1.substring(2,n)+s1.substring(0,2);
            String temp2=s1.substring(n-2,n)+s1.substring(0,n-2);
            
            if(temp1.equals(s2) || temp2.equals(s2))return true;
            
            return false;
            
        }
}

