public class Rev_Word_In_Arr {
    public static String rev_word(String s) {
        String words[] = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "i am good morning"; // -> morning good am i
        System.out.println(rev_word(s));
    }
}
