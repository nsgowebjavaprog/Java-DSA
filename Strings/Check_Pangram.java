public class Check_Pangram {
    public static boolean Pangram(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            String temp = c + "";
            if (!sentence.contains(temp))
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "asdfghjklqwer tyui op mnzxcvb";

        System.out.println(Pangram(sentence));
    }
}
