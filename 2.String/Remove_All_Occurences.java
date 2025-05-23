public class Remove_All_Occurences {

    public static String remAllOccurences(String str, String part) {
        while (str.contains(part)) {
            str = str.replaceFirst(part, "");
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println("Remove all Parts:- " + remAllOccurences(str, part));
    }
}
