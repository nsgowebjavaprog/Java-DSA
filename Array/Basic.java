//Array contains only one type of DATA TYPE of Elements
// arr[] = {1,2,3,4,5};
// inr arr[] = new int[size];

// 1.Large Element in an Array
/*
public class Array_One_Short {
    public static void is_Large(int arr[]){
        int largest = arr[0];
        for (int i =1; i <=arr.length-1; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("largest Element: "+largest);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        is_Large(arr);
    }
}
*/
// largest Element: 5

// 2. 2nd Large element
/*
public class Array_One_Short {
    public static int second_largest(int arr[]){
        int largest = arr[0];
        int sec_large = -1;
        for (int i =1; i < arr.length; i++) {
            if(arr[i] > largest){
                sec_large = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sec_large){
                sec_large = arr[i];
            }
        }
        System.out.println("Second large element: "+sec_large);
        return sec_large;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,7,7,5};
        second_largest(arr);
    }
}
 */
// Second large element: 5


// 3.Second Smallest element
/*
public class Array_One_Short {
    public static int sec_small(int arr[]) {
        int smallest = arr[0];
        int sec_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sec_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < sec_smallest) {
                sec_smallest = arr[i];
            }
        }
        System.out.println("Second Smallest: " + sec_smallest);
        return sec_smallest;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 6, 8, 2};
        sec_small(arr);
    }
}
 */


// 4. Check Array is sorted or Not
/*
public class Array_One_Short {
    public static boolean sort_or_not(int arr[]){
        for (int i =1; i <arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,45};
        if (sort_or_not(arr)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not");
        }
    }
}
*/


// 4. Remove duplicate from sorted Array
/*
class Solution {
    public  static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != nums[i])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
}
*/

// 5.Left Rotate by 1 Element
/*
public class Array_One_Short {
    public static void one_ele(int arr[]){
        int temp = arr[0];
        for (int i =1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        one_ele(arr);
        for (int i =0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
*/

// 6.Left Rotate by N Element     TC = O(2N)   SC= O(1)
/*
public class Array_One_Short {
    public static void rotate_n_num(int arr[], int k){
        int n = arr.length;
        k = k % n;

// declare temp array
        int temp[] = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }

    public static void main(String[] args) {
        int k=3;
        int arr[] = {1,2,3,4,5,6};     // 4 5 6 1 2 3
        rotate_n_num(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
*/



// 6.Left Rotate by N Element
/*
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        while( start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
 */


// 7.MOVE ALL ZERO TO END
/*
public class Array_One_Short {
    public static void move_zero_last(int arr[]){
        int i = 0;
        for(int num : arr){
            if(num != 0){
                arr[i++] = num;
            }
        }
        while(i < arr.length){
            arr[i++] = 0;
        }
    }
    public static void main(String[] args) {
     int arr[] = {1,0,2,4,5,0,0,3,0,4};
     move_zero_last(arr);
        for (int i = 0; i < arr.length ; i++) {     // 1 2 4 5 3 4 0 0 0 0
            System.out.print(arr[i]+" ");
        }
    }
}
 */


// 8.Linear Search
/*
public class Array_One_Short {
    public static int linear_search(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,10};
        int key = 6;
        int output = linear_search(arr,key);

        if(output != -1){
            System.out.println("Idx: "+output);
        }else{
            System.out.println("Not Found");
        }
    }
}
// Idx: 5
 */


// 9. Union of 2 sorted array

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8};

        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union of two arrays is: " + set);   // Union of two arrays is: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}

