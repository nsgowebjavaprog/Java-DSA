import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class One {
    public void print_geek() {
        System.out.print("NS ");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("Loni");
    }
}

// Driver class
public class Extend_Class {
    // Main function
    public static void main(String[] args) {
        Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
