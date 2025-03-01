public class Roman_to_Integer {
    public static int R_to_I(String str) {
        int res = 0;
        int num = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I':
                    num = 1;
                    break;

                case 'V':
                    num = 5;
                    break;

                case 'X':
                    num = 10;
                    break;

                case 'L':
                    num = 50;
                    break;

                case 'C':
                    num = 100;
                    break;

                case 'D':
                    num = 500;
                    break;

                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num > res) {
                res = res + num;
            } else {
                res = res - num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "CD";
        System.out.println(R_to_I(str));
    }
}
