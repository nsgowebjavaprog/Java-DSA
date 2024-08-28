//package Bit-Manipulation-DSA;

public class Set_ith_Bit {
    public static void main(String[] args) {

        // N=9 => {1 0 0 1} i=2
        // {1 1 0 1} --> N = 13

        // OR----> OPEARATOR

        // N = 9 ---> 1 0 0 1
        // OR
        // if i=2 --> 1 0 0
        // OR result->1 1 0 1 ===> 13

        int n = 9;
        int i = 2;

        n = n | (1 << i);
        System.out.println("Result is: " + n);
    }
}
// OUTPUT
// Result is: 13