public class Bit_is_Set_or_Not {
    public static void main(String[] args) {

        int n = 13;
        int i = 2;

        if ((n & (1 << i)) != 0) {
            System.out.println(i + "Set");
        } else {
            System.out.println(i + "Not Set");
        }
    }
}