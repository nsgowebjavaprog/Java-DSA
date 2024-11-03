public class Set_Char_At {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("nS LONI");
        System.out.println(s);

        // chaarAt
        System.out.println(s.charAt(0));
        s.setCharAt(0, 'N');
        System.out.println(s);
    }

}
// nS LONI
// n
// NS LONI