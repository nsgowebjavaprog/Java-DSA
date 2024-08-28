
//package Bit-Manipulation-DSA;
import java.io.*;

public class Nth_Bit_Set_or_Not {
    public static void main(String[] args) {
        // N = 13 -->(1,1,0,1) if i=2
        // Then ---->[3,2,1,0]-----> Set
        // if i=1 --> Then---->Not set

        // Answer right sift >> if --> i.n=2 ii.n=1
        // N = 13 --> 1,1,0,1 >> 2 ---> 1,1 + 1 --> 0,[1]--Set
        // N = 13 --> 1,1,0,1 >> 1 ---> 1,1,0 + 1 --> 0,[0]--Not Set

        // TC-> O(1)

        int n = 13; // Example number
        int i = 2; // Example bit position
        if (i < 0 || i >= 32) {
            System.out.println("Invalid Bit Position");
            return;
        }
        if (((n >> i) & 1) == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
// OUTPUT
// True