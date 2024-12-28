public class TOP_ARRAY_PROGRAMMS {
    public static void main(String[] args) {
        // 1. Kadane's Algorithm
        // Difficulty: MediumAccuracy: 36.28%Submissions: 1MPoints: 4
        // Given an integer array arr[]. You need to find the maximum sum of a subarray.

        // Examples:

        // Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
        // Output: 11
        // Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
        // Input: arr[] = [-2, -4]
        // Output: -2
        // Explanation: The subarray {-2} has the largest sum -2.
        // Input: arr[] = [5, 4, 1, 7, 8]
        // Output: 25
        // Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25. 

/* 
        class Solution {

            // arr: input array
            // Function to find the sum of contiguous subarray with maximum sum.
            int maxSubarraySum(int[] arr) {
        
                // Your code here
                int sum = 0;
                int max =  Integer.MIN_VALUE;
                for(int i=0; i<arr.length; i++){
                    sum = sum+arr[i];
                    
                if(sum > max){
                    max = sum;
                }    
                if(sum < 0){
                    sum = 0;
                }
                }
                return max;
            }
        }
*/


        // 2.Search in a Row-Column sorted matrix

        // Difficulty: EasyAccuracy: 41.62%Submissions: 137K+Points: 2
        // Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.
        
        // Examples:
        
        // Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
        // Output: false
        // Explanation: 62 is not present in the matrix, so output is false.
        // Input: mat[][] = [[18, 21, 27],[38, 55, 67]], x = 55
        // Output: true
        // Explanation: 55 is present in the matrix.
        // Input: mat[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]], x = 3
        // Output: true
        // Explanation: 3 is present in the matrix.


        /*
        class Solution {
            public static boolean matSearch(int mat[][], int x) {
                // your code here
                int n = mat.length;
                int m = mat[0].length;
                int i=0;
                int j=m-1;
                
                while(i<n && j>=0){
                    if(x>mat[i][j]){
                        i++;
                    }
                    else if(x<mat[i][j]){
                        j--;
                    }
                    else{
                        return true;
                    }
                }
                return false;
            }
        }
         */




       //   3.Spirally traversing a matrix

          /*
            class Solution {
                // Function to return a list of integers denoting spiral traversal of matrix.
                public ArrayList<Integer> spirallyTraverse(int mat[][]) {
                    // code here
                    int n = mat.length;
                    int m = mat[0].length;
                    // Upper-Side
                    int top = 0;
                    int left = 0;
                    int right = n-1;
                    int btm = m-1;
                    ArrayList<Integer> res = new ArrayList<>();
                    while(top <= btm && left <= right){
                        // 1
                        
                        for(int i= left; i<= right; ++i){
                            res.add(mat[top][i]);
                        }
                        top++;
                        
                        // 2
                        for(int i=top; i<=btm; ++i){
                            res.add(mat[i][right]);
                        }
                        right--;
                        
                        if(top <= btm){
                            for(int i=right; i>= left; --i){
                                res.add(mat[btm][i]);
                            }
                            btm--;
                        }
                        
                        if(left <= right){
                            for(int i=btm; i>=top; --i){
                                res.add(mat[i][left]);
                            }
                        left++;
                        }
                    }
                    return res;
                }
            }
           */



        // 4. Rotate Array
            // Difficulty: MediumAccuracy: 37.06%Submissions: 425K+Points: 4
            // Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

            // Note: Consider the array as circular.

            // Examples :

            // Input: arr[] = [1, 2, 3, 4, 5], d = 2
            // Output: [3, 4, 5, 1, 2]
            // Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
            // Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
            // Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
            // Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6

            /*
             
            class Solution {
                // Function to rotate an array by d elements in counter-clockwise direction.
                static void rotateArr(int arr[], int d) {
                    // add your code here
                    int n = arr.length;
                    d=d%n;
                    reverse(arr,0,n-1);
                    reverse(arr,n-d,n-1);
                    reverse(arr,0,n-1-d);
                }
                static void reverse(int[]arr,int start,int end){
                    while(start<end){
                        int temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                        start++;
                        end--;
                    }
                }
            }
             */


            // 5. Sum – Count pairs with given sum
                // Last Updated : 21 Oct, 2024
                // Given an array arr[] of n integers and a target value, the task is to find the number of pairs of integers in the array whose sum is equal to target.

                // Examples:  

                // Input: arr[] = {1, 5, 7, -1, 5}, target = 6
                // Output:  3
                // Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).         


                // Input: arr[] = {1, 1, 1, 1}, target = 2
                // Output:  6
                // Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1) and (1, 1).


                // Input: arr[] = {10, 12, 10, 15, -1}, target = 125
                // Output:  0

                // import java.util.Map;
                // import java.util.HashMap;

            /*    class GfG {
                    
                    // Returns number of pairs in arr[0...n-1] with
                    // sum equal to 'target'
                    static int countPairs(int[] arr, int target) {
                        Map<Integer, Integer> freq = new HashMap<>();
                        int cnt = 0;

                        for (int i = 0; i < arr.length; i++) {
                        
                            // Check if the complement (target - arr[i])
                            // exists in the map. If yes, increment count
                            if (freq.containsKey(target - arr[i])) {
                                cnt += freq.get(target - arr[i]); 
                            }
                        
                            // Increment the frequency of arr[i]
                            freq.put(arr[i], 
                                    freq.getOrDefault(arr[i], 0) + 1); 
                        }
                        return cnt;
                    }

                    public static void main(String[] args) {
                        int[] arr = {1, 5, 7, -1, 5}; 
                        int target = 6; 
                        System.out.println(countPairs(arr, target));    
                    }
                }

            */


            // 6.import java.util.ArrayList;

            /* 
                import java.util.List;

                public class Solution {
                    public List<Integer> findDuplicates(int[] nums)
                    {
                        int n = nums.length; // Get the length of the input
                                            // array
                    
                        int[] arr = new int[n+1]; // Create an auxiliary
                                                // array of size n+1
                        List<Integer> list
                            = new ArrayList<>(); // List to store duplicates

                        // Iterate through each number in the input array
                        for (int i : nums) {
                            if (++arr[i] > 1) // Increment the count for 
                                // this number and check if it is now a duplicate
                            
                                list.add(i); // If it is a duplicate, add it
                                            // to the list
                        }

                        return list; // Return the list of duplicates
                    }


                    ---------------------------------------------------------------------------
                    Arrays.sort(arr);
                    int n = arr.length;
                    int[] res_arr = new int[n+1];
                        List<Integer> list = new ArrayList<>();
                        
                        for(int i: arr){
                            if(++res_arr[i] > 1){
                                list.add(i);
                            } 
                        }
                        return list;

                    ---------------------------------------------------------------------------


                    // Driver Code
                    public static void main(String[] args)
                    {
                        Solution solution = new Solution();
                        int[] nums = { 4, 3, 2, 7, 7, 2, 3, 1 };
                        List<Integer> duplicates
                            = solution.findDuplicates(nums);
                        System.out.print("Duplicate elements are: ");
                        for (int num : duplicates) {
                            System.out.print(num + " ");
                        }
                        System.out.println(); // Output: Duplicate elements
                                            // are: 2 3
                    }
                }
            */


                //  // 7.Triplet Sum in Array
                //     Difficulty: MediumAccuracy: 35.0%Submissions: 308K+Points: 4
                //     Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.

                //     Return true if such a triplet exists, otherwise, return false.

                //     Examples

                //     Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13 
                //     Output: true 
                //     Explanation: The triplet {1, 4, 8} sums up to 13
                //     Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10 
                //     Output: true 
                //     Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10. 
                //     Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24 
                //     Output: false 
                //     Explanation: No triplet in the array sums to 24


                /*
                 class Solution {
                // Should return true if there is a triplet with sum equal
                // to x in arr[], otherwise false
                public static boolean hasTripletSum(int arr[], int target) {
                    // Your code Here
                    int n = arr.length;

                    // Sort the elements
                    Arrays.sort(arr);

                    // Fix the first element one by one
                    // and find the other two elements
                    for (int i = 0; i < n - 2; i++) {

                        // To find the other two elements, start two
                        // index variables from two corners of the array
                        // and move them toward each other
                        int l = i + 1; // index of the first element
                        int r = n - 1; // index of the last element

                        while (l < r) {
                            int curr_sum = arr[i] + arr[l] + arr[r];
                            if (curr_sum == target) {
                                return true;
                            }
                            else if (curr_sum < target) {
                                l++;
                            }
                            else { 
                                r--;
                            }
                        }
                    }
                    return false;
                }
            }
                 */
    }
}
