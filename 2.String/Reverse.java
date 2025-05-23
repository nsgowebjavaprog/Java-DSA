public class Reverse {

    public static String rev_string(String rev_name) {
        StringBuilder sb = new StringBuilder(rev_name);
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String rev_name = "inoL jaragaN";
        System.out.println("Rev-Name :- " + rev_string(rev_name));
    }
}