class Loni{

    public void sayHello() {
        System.out.println("Hello");
    }

    public String isStr(int cost) {
        if (cost > 100) {
            return "Expensive";
        } else {
            return "Cheap";
        }
    }
}

public class Methods {
    public static void main(String[] args) {

        Loni l = new Loni();
        l.sayHello();

        String strr = l.isStr(101);
        System.out.println(strr);
    }
}
