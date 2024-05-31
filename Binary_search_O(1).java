public class Binary_Search_O(1) {
                 
    public static int binary_search(int nums[], int idx){

        return nums[idx];
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7,8};

        int idx = 4;
        
        System.out.println("Index of b "+idx+" is : "+binary_search(nums,idx));
    }
}

//  Index of b 4 is : 5
