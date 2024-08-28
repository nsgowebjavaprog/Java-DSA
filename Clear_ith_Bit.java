//package Bit-Manipulation-DSA;

public class Clear_ith_Bit {
    public static void main(String[] args) {
        // 1
        // N = 13----> 1 1 0 1 i=2
        // 1 0 0 1--> N=9

        // 2
        // 1 << i
        // n* = Not --> Res
        // n & n*-------> n & ~(1 << i)

        int n = 13;
        int i = 2;

        n = (n & ~(1 << i));
        System.out.println("Result is: " + n);
    }
}
// OUTPUT

// Result is: 9
