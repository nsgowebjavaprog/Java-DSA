public class Str_Immutable {
    // In String not allow CRUD operation in MEMORY
    public static void main(String[] args) {
        String s1 = "Hello"; // String literal
        String s2 = "Hello"; // String literal
        String s3 = s1; // same reference
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);

    }
}
