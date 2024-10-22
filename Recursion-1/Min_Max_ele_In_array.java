// Maximum and Minimun element in an Array
public class Min_Max_ele_In_array {
    static class MaxMin {
        int max;
        int min;
    }

    public static MaxMin findMaxMin(int[] arr, int index) {
        MaxMin mm = new MaxMin();

        // Base case: last element
        if (index == arr.length - 1) {
            mm.max = mm.min = arr[index];
        } 
        // Recursive case
        else {
            MaxMin next = findMaxMin(arr, index + 1);
            mm.max = Math.max(arr[index], next.max);
            mm.min = Math.min(arr[index], next.min);
        }
        return mm;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        MaxMin result = findMaxMin(arr, 0);
        System.out.println("Max: " + result.max);
        System.out.println("Min: " + result.min);
    }
}