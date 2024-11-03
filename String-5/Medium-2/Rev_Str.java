public class Rev_Str {
    public static void main(String[] args) {
        // Hello -------> olleH
        String s = "olleH";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
// Hello