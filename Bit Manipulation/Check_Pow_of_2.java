public class Check_Pow_of_2 {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 15;
        int n3 = 8;

        if ((n1 & (n1 - 1)) == 0) {
            System.out.println(n1 + " is Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }

        if ((n2 & (n2 - 1)) == 0) {
            System.out.println(n2 + " is Power of 2");
        } else {
            System.out.println(n2 + " Not a Power of 2");
        }

        if ((n3 & (n3 - 1)) == 0) {
            System.out.println(n3 + " is Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
    }

}
