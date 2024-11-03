public class Compare_To {
    public static void main(String[] args) {
        String name1 = "NS LONI";
        String name2 = "NS LONI";

        if (name1.compareTo(name2) == 0) {

            // name1 > name2 = +ve
            // name1 == name2 = 0
            // name1 < name2 = -ve

            System.out.println("Equals");
        } else {
            System.out.println("String Not Equals");
        }
    }
}
// Equals