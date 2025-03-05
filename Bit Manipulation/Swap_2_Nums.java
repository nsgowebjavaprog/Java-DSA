public class Swap_2_Nums {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a != b) {

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("After the swap A: " + a);
            System.out.println("After the swap B: " + b);
        } else {
            System.out.println("Same Element's");
        }
    }
}
