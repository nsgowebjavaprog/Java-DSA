public class Longest_Suffix_PreFix {
    public static int Large_Suffix_and_Prefix(String str) {
        int n = str.length();
        // int lps[] = new int[256];
        int lps[] = new int[256];

        int pre_fix = 0;

        for (int suffix = 1; suffix < n; suffix++) {
            while (0 < pre_fix && str.charAt(suffix) != str.charAt(pre_fix)) {
                pre_fix = lps[pre_fix - 1];
            }
            if (str.charAt(suffix) == str.charAt(pre_fix)) {
                pre_fix++;
            }
            lps[suffix] = pre_fix;

        }
        return lps[n - 1];
    }

    public static void main(String[] args) {
        String str = "ABCABDABCABABC";
        System.out.println(Large_Suffix_and_Prefix(str));
    }
}
