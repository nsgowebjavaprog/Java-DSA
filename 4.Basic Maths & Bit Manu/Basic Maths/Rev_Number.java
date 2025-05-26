public class Rev_Number {

    public static int revNumber(int num) {
        int rev_num_res = 0;
        while (num > 0) {
            int last_dig = num % 10;
            num = num / 10;
            rev_num_res = (rev_num_res * 10) + last_dig;
        }
        return rev_num_res;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Rev number: " + revNumber(num));
    }
}
