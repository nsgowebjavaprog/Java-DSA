public class Remove_All_Occurence {
    public static String removeAllOccurence(String str, String part) {
        while (str.contains(part)) {
            str = str.replaceFirst(part, "");
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "dsabcabcabc";
        String part = "abc";
        System.out.println(removeAllOccurence(str, part));
    }

}
