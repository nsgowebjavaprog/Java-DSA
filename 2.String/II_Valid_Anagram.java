public class II_Valid_Anagram {

    public static boolean validAnaGram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count[] = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "gramana";
        System.out.println(validAnaGram(s1, s2));
    }
}