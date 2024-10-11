package Recursion;

public class Sum_Upto_N {
    // Function to calculate the sum of array elements
    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println("Sum of the array elements is: " + sum(arr));
    }
}
