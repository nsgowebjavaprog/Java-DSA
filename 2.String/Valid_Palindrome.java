public class Valid_Palindrome {
    public static boolean valid_palim(String str_1) {
        // String s = str_1.toLowerCase();
        // s = s.replaceAll("[^a-zA-z0-9]", "");

        str_1 = str_1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int j = str_1.length() - 1;

        while (i < j) {
            if (str_1.charAt(i) != str_1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str_1 = "A man, anama";
        System.out.println(valid_palim(str_1));
    }
}
