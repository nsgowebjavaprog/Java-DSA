public class Defaning_An_IP_adr {
    public static String IP_Adr(String str) {
        return str.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String str = "1.1.1.1.";
        System.out.println(IP_Adr(str));
    }
}
