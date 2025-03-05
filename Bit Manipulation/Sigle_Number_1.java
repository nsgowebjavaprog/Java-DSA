public class Sigle_Number_1 {
    // 2 time and 1 time repeatation
    public static void main(String[] args) {
        int XOR = 0;
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };

        for (int i = 0; i < nums.length; i++) {
            XOR = XOR ^ nums[i];
        }
        System.out.println(XOR);
    }
}
