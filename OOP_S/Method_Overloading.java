class Method_Overloading_A {
    public void show() {
        System.out.println("Method 1");
    }

    public void con() {
        System.out.println("Method 2");
    }
}

class Method_Overloading_B extends Method_Overloading_A {
    public void show() {
        System.out.println("Method 3");
    }

    public void con() {
        System.out.println("Method 4");
    }
}

public class Method_Overloading {
    public static void main(String[] args) {

        Method_Overloading_B obj = new Method_Overloading_B();
        obj.show();
        obj.con();

        // Method Overloading same- same method name but different parameters

        // obj.show__1();
        // obj.con__1();
    }
}
