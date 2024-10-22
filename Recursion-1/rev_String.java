//Reverse a String
public class rev_String {
    public static void rev_string(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev_string(str, idx - 1);
    }

    public static void main(String[] args) {// GooD MorninG
        String str = "GninroM DooG";
        rev_string(str, str.length() - 1);
    }
}
