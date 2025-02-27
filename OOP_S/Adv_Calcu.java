class Calcu {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Adv_Calcu {

    public static void main(String[] args) {

        Calcu obj = new Calcu();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.sub(20, 10));
    }
}
