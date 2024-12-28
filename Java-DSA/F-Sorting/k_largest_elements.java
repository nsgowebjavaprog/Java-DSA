//                                                  1. k largest elements

// Given an array arr[] of positive integers and an integer k, Your task is to return k largest elements in decreasing order. 

// Examples

// Input: arr[] = [12, 5, 787, 1, 23], k = 2
// Output: [787, 23]
// Explanation: 1st largest element in the array is 787 and second largest is 23.

// Input: arr[] = [1, 23, 12, 9, 30, 2, 50], k = 3 
// Output: [50, 30, 23]
// Explanation: Three Largest elements in the array are 50, 30 and 23.

// Input: arr[] = [12, 23], k = 1
// Output: [23]
// Explanation: 1st Largest element in the array is 23.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> kLargest(int arr[], int k) {
        // write code here
        Arrays.sort(arr);
        List<Integer>list1=new ArrayList<>();
        for(int i=arr.length-1;i>=arr.length-k;i--)
        {
            list1.add(arr[i]);
        }
        return list1;
    }
}