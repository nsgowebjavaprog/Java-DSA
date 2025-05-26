import java.util.Arrays;

public class Swap_2_Nums {

    public static int[] swapWithOutTemp(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[] { a, b };
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before A: " + a + " & B: " + b);
        int[] swapped = swapWithOutTemp(a, b);
        System.out.println("After swap A and B: " + Arrays.toString(swapped));
    }
}