class Loni {

    public void sayHello() {
        System.out.println("Hello");
    }

    public String isStr(int cost) {
        if (cost > 100) {
            return "Expensive";
        }
        return "Cheap";
    }

    // Method overloading

    public int add(int a, int b, int c) {
        return a + b;
    }
}

public class Methods2 {
    public static void main(String[] args) {

        Loni l = new Loni();
        l.sayHello();

        String strr = l.isStr(101);
        System.out.println(strr);

        System.out.println(l.add(10, 11, 12));
    }
}
