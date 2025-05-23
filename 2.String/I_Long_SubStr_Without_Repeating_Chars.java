import java.util.HashMap;

public class I_Long_SubStr_Without_Repeating_Chars {
    public static int longSubStringNoRepeatingChars(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max_len = 0;
        int idx;

        for (idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);

            if (map.containsKey(c)) {
                // map.get(c) --> gives the last index where c appeared.

                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, idx);
            max_len = Math.max(max_len, idx - left + 1);
        }
        return max_len;
    }

    public static void main(String[] args) {
        String s = "asdfghasd";
        System.out.println(longSubStringNoRepeatingChars(s));
    }
}