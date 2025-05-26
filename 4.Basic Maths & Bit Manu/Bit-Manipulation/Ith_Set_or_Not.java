public class Ith_Set_or_Not {

    public static boolean ithSetOrNot(int num, int bit) {
        if ((num & (1 << bit)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 13;
        int bit = 2;

        System.out.println("Check ith bit is Set or Not: " + ithSetOrNot(num, bit));
    }
}
