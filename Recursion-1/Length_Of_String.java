// Length Of String Using Recursion.
public class Length_Of_String {

    public static int len_string(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            return 1 + len_string(str.substring(1));
        }
    }

    public static void main(String[] args) {// String Length: 12
        String str = "GooD MorninG";
        int length = len_string(str);
        System.out.println("String Length: " + length);
    }
}