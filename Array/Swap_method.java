import java.util.*;

public class Swap_method {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping: " + a + " " + b);
        swap(a, b);
        System.out.println("After Swapping: " + a + "  " + b);
    }

}
