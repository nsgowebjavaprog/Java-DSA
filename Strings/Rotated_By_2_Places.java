public class Rotated_By_2_Places {
    public static boolean Two_Places(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concat_Str1 = str1.concat(str1);
        String concat_Str2 = str2.concat(str2);

        int a = concat_Str1.indexOf(str1);
        int b = concat_Str2.indexOf(str2);

        if (a == 2 || b == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";

        System.out.println(Two_Places(str1, str2));
    }

}
