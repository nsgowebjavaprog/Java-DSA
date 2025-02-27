class Aa {
    public Aa() {
        System.out.println("In A");
    }
}

class Cc extends Aa {
    public Cc() {
        super(); // Calls the constructor of superclass A
        System.out.println("In C");
        this.test(); // Calls the test() method of the current class C
    }

    public void test() {
        System.out.println("In test() of C");
    }
}

public class This_Super {
    public static void main(String[] args) {
        C obj = new C();
    }
}

// this keyword
// super keyword
// this keyword is used to refer to the current object
// super keyword is used to refer to the immediate parent class object
// this keyword is used to refer to the current class instance variable
// super keyword is used to refer to the immediate parent class instance
// variable
// this keyword is used to invoke the current class method
// super keyword is used to invoke the immediate parent class method
// this keyword is used to invoke the current class constructor
