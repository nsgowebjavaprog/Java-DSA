public class Count_number_set_bits_1s {

    public static int countSetBitSimple(int num) {

        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println("Count the number set bits 1's: " + countSetBitSimple(num));
    }
}

// Step 3: How Brian Kernighan’s Algorithm counts set bits in 13?
// Start: n = 13 (1101 binary), count = 0

// Each step does:
// n = n & (n - 1) → This removes the rightmost set bit from n.

// Iteration 1:
// n = 13 (1101)

// n - 1 = 12 (1100)

// n & (n - 1) = 1101 & 1100 = 1100 (12)

// Increment count → count = 1

// Iteration 2:
// n = 12 (1100)

// n - 1 = 11 (1011)

// n & (n - 1) = 1100 & 1011 = 1000 (8)

// Increment count → count = 2

// Iteration 3:
// n = 8 (1000)

// n - 1 = 7 (0111)

// n & (n - 1) = 1000 & 0111 = 0000 (0)

// Increment count → count = 3

// Iteration 4:
// n = 0, stop the loop.

// Final answer: count = 3