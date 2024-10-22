// Total sum of Given Array
public class Sum_Of_Array {
    static int sum_Of_Array(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {// 15
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum_Of_Array(arr));
    }
}
