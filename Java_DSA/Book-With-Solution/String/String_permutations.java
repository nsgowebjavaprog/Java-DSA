public class String_permutations {
    public static void main(String[] args) {

        // calls the check_permutation method with two string arguments
        System.out.println(check_permutation("abcdefg", "gfedcba"));
    }

    public static boolean check_permutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Strign to char array
        char[] chaarr1 = str1.toCharArray();
        char[] chaarr2 = str2.toCharArray();

        java.util.Arrays.sort(chaarr1);
        java.util.Arrays.sort(chaarr2);

        return java.util.Arrays.equals(chaarr1, chaarr2);
    }
}
