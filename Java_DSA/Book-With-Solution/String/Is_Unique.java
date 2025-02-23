public class Is_Unique {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefg")); 
        System.out.println(isUnique("abcadefg")); 
    }

    public static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
