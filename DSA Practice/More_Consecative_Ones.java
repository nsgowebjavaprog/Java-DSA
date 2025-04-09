public class More_Consecative_Ones {

    public static int findMaxConsecutiveOnes(int arr[]) {

        int maxCount = 0;
        int curr_Count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                curr_Count++;
            } else {
                maxCount = Math.max(maxCount, curr_Count);
                curr_Count = 0;
            }

        }
        maxCount = Math.max(maxCount, curr_Count);
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
