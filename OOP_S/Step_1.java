class Calc {

    public int add(int a, int b) {
        return a + b;
    }

}

public class Step_1 {
    public static void main(String[] args) {

        Calc obj = new Calc();
        System.out.println(obj.add(10, 20));
    }
}