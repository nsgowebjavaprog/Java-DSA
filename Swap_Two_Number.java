//package Bit-Manipulation-DSA;

public class Swap_Two_Number {
    // a = a ^ b --> to store the XOR of a and b in a.
    // b = a ^ b --> to store the original value of a in b.
    // a = a ^ b --> to store the original value of b in a.

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swaping value is a: " + a + " b: " + b + "\n ");
        // 1
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swaping result is a= " + a + " b= " + b);
    }
}
// OUTPUT

// Before swaping value is a: 10 b: 20

// After swaping result is a= 20 b= 10