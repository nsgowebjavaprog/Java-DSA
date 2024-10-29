public class Append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("NS");
        System.out.println(s);

        s.append(" ");
        s.append("L"); // str = str + "L";
        s.append("O");
        s.append("N");
        s.append("I");
        System.out.println(s);
        System.out.println(s.length());
    }
}
// NS
// NS LONI
// 7