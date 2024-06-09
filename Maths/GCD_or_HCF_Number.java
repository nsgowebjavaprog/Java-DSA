package Maths;
// A, B some value
// A != B
// if A>B
// A=A-B
// if B>A
// B=B-A
public class GCD_or_HCF_Number {
    public static void main(String[] args) {
        
        int a = 98, b = 56;
        while (a != b) {
            if (a == 0) {
                System.out.println("GCD" + b);
                break;
            }
            if (b == 0) {
                System.out.println("GCD" + a);
                break;
            }
            if (a > b)
                a = a - b;
            if (b > a)
                b = b - a;
        }
        if (a == b) {
            System.out.println("GCD: " + a);  // we print a (or) b becz having same value
        }
    }
}
