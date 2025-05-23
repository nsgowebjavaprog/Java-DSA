import java.util.Stack;

public class IIII_Valid_Parentheses {

    public static boolean isValidParant(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '[')
                st.push(']');
            else if (c == '{')
                st.push('}');

            else if (st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(([,]))";
        System.out.println(isValidParant(s));
    }
}