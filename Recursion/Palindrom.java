public class Palindrom {

    public static String palindrom(int i, String str) {

        if (i >= str.length() / 2)
            return "true";

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return "false";
        }

        return palindrom(i + 1, str);
    }

    public static void main(String[] args) {
        String str = "mawasam";
        System.out.println(palindrom(0, str));
    }
}