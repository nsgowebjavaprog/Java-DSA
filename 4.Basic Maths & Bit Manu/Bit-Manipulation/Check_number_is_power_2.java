public class Check_number_is_power_2 {

    // Check if a given integer n is a power of 2.
    // (E.g., 1, 2, 4, 8, 16, 32, 64, 128... are all powers of 2)

    // | Number | Binary |
    // | ------ | ----------------------- |
    // | 1 | 0001 |
    // | 2 | 0010 |
    // | 4 | 0100 |
    // | 8 | 1000 |
    // | 10 | 1010 (❌ not power of 2) |

    public static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        if (isPowerOfTwo(num)) {
            System.out.println("Yes ---> " + num + " is Power of 2:");
        } else {
            System.out.println("Not a Power of the 2");
        }
    }
}