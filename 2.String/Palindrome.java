class Palindrome {

    public static boolean pali_drome(String pali) {
        // Convert to the Lower Case
        String str = pali.toLowerCase();
        System.out.println(str);
        for (int i = 0; i < str.length() / 2; i++) {
            char char_start = str.charAt(i);
            char char_end = str.charAt(str.length() - 1 - i);
            if (char_start != char_end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pali = "asdsa";
        System.out.println("Result is:- " + pali_drome(pali));
    }
}