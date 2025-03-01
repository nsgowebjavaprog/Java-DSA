public class Rev_Words_In_String {
    public static String Rev_words_In_string(String str) {
        String word[] = str.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "? Bentch Last on siting student good Why";
        System.out.println(Rev_words_In_string(str));
    }
}
