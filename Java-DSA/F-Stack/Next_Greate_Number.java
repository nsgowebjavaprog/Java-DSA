/*
 Next Greater Element (NGE) for every element in given Array
Last Updated : 01 Oct, 2024
Given an array, print the Next Greater Element (NGE) for every element. 

Note: The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 

Examples: 

Input: arr[] = [ 4 , 5 , 2 , 25 ]
Output:  4      –>   5
               5      –>   25
               2      –>   25
              25     –>   -1
Explanation: Except 25 every element has an element greater than them present on the right side


Input: arr[] = [ 13 , 7, 6 , 12 ]
Output:  13      –>    -1
                7       –>     12
                6       –>     12
               12      –>     -1
Explanation: 13 and 12 don’t have any element greater than them present on the right side
 */

import java.util.ArrayList;
import java.util.Stack;

public class Next_Greate_Number {


class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result.set(stack.pop(), arr[i]);
            }
            stack.push(i);
        }

        return result;
    }
}
    
}
