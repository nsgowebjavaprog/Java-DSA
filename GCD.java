//package Maths-DSA;

// GCD of (9, 12)---> 1 and 3 --> But 3 is Greater
//  ANS:- 3
//         09 --> [1],[3],9
//         12 --> [1],2,[3],4,6,12

public class GCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
// OUTPUT
// GCD of 9 and 12 is: 3