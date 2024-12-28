class Solution {
    boolean valid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else if (!st.isEmpty() && isMatchingPair(c, st.peek())) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    private boolean isMatchingPair(char closing, char opening) {
        return (closing == ')' && opening == '(') ||
               (closing == '}' && opening == '{') ||
               (closing == ']' && opening == '[');
    }
}