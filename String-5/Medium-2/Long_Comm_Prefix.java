import java.io.*;

import java.util.Arrays;

public class Long_Comm_Prefix {
    public static String long_comm_Prefix(String[] s) {
        Arrays.sort(s);
        String first_str = s[0];
        String last_str = s[s.length - 1];
        int idx = 0;
        while (idx < first_str.length()) {
            if (first_str.charAt(idx) == last_str.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return idx == 0 ? "" : first_str.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] s = { "Hello", "Hey", "Hemaa" };
        System.out.println(long_comm_Prefix(s)); // He
    }
}
