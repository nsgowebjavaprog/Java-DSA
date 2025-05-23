public class Rev_Words_In_String {

    public static String revWordsInString(String str) {
        String str_arr[] = str.split(" +"); // Remove all space & str --> words
        StringBuilder sb = new StringBuilder();
        for (String i : str_arr) {
            sb.append(new StringBuilder(i).reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "ehT SN inoL";
        System.out.println(revWordsInString(str));
    }
}
