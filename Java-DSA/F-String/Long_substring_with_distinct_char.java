//                                       1. Longest substring with distinct characters

// Given a string s, find the length of the longest substring with all distinct characters. 

// Examples:

// Input: s = "geeksforgeeks"
// Output: 7
// Explanation: "eksforg" is the longest substring with all distinct characters.

// Input: s = "aaa"
// Output: 1
// Explanation: "a" is the longest substring with all distinct characters.

// Input: s = "abcdefabcbb"
// Output: 6
// Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.

import java.util.HashMap;

class Solution {
    public int longestSubstrDistinctChars(String s) {
        int n = s.length(), l = 0, len = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) {
            l = Math.max(l, map.getOrDefault(s.charAt(r), -1) + 1);
            map.put(s.charAt(r), r);
            len = Math.max(len, r - l + 1);
        }
        return len;
    }
}