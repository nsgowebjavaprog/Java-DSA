public class Palindrome_Num {

    public static boolean paliNum(int num) {
        int rev_num = 0;
        int org_num = num;

        while (num > 0) {
            int last_dig = num % 10;
            num = num / 10;
            rev_num = (rev_num * 10) + last_dig;
        }
        return (rev_num == org_num);
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Pali Num: " + paliNum(num));
    }
}
