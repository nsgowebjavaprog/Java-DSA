import java.util.*;

public class III_Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str_s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        III_Group_Anagrams obj = new III_Group_Anagrams(); // create object to call non-static method
        System.out.println(obj.groupAnagrams(str_s));
    }
}