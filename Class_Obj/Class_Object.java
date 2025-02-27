class Calculate {
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class Class_Object {
    public static void main(String[] args) {

        Calculate cal = new Calculate();
        System.out.println(cal.add(10, 20));
    }
}