// Move all "X" to Last of the String.
public class Move_All_X_last {
    public static void move_X_Last(String str, int idx, int count, String newString) {
        // Final Result
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        // working function
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            move_X_Last(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            move_X_Last(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbxcxdxex";
        move_X_Last(str, 0, 0, " "); // abcdexxxxx
    }
}
