public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int count = 0, major_ele = -1;

        // Phase 1: Find a candidate
        for (int i : arr) {
            if (count == 0) {
                major_ele = i;
                count = 1;
            } else if (i == major_ele) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        count = 0;
        for (int i : arr) {
            if (i == major_ele)
                count++;
        }

        if (count > arr.length / 2)
            return major_ele;
        else
            return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 2, 2, 3, 2 };
        int majority = findMajorityElement(arr);
        if (majority != -1)
            System.out.println("Majority Element: " + majority);
        else
            System.out.println("No Majority Element found");
    }
}
