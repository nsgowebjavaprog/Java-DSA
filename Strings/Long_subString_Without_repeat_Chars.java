import java.util.HashMap;

public class Long_subString_Without_repeat_Chars {
    public static int Long_Substring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max_len = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            max_len = Math.max(max_len, right - left + 1);

        }
        return max_len;

    }

    public static void main(String[] args) {
        String str = "abcdecbeadf";
        System.out.println(Long_Substring(str));
    }

}
