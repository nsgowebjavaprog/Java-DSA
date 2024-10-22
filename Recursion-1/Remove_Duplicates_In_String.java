public class Remove_Duplicates_In_String {

    public static String removeDuplicates(String str) {
        return removeDuplicates(str, 0, new StringBuilder());
    }

    private static String removeDuplicates(String str, int index, StringBuilder result) {
        // Base case: end of string
        if (index == str.length()) {
            return result.toString();
        }

        // Check if char already exists in result
        if (result.toString().indexOf(str.charAt(index)) == -1) {
            result.append(str.charAt(index));
        }

        // Recurse on next character
        return removeDuplicates(str, index + 1, result);
    }

    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("String without duplicates: " + removeDuplicates(str));
    }
}
