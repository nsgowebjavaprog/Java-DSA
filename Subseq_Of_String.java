public class Subseq_Of_String {
    public static void sub_seqences(String str, int idx, String newString) {
        if (idx == str.length()) { // last
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        sub_seqences(str, idx + 1, newString + currChar);
        sub_seqences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "ABC";
        sub_seqences(str, 0, "");
    }
}
// OUTPUT
// ABC
// AB
// AC
// A
// BC
// B
// C