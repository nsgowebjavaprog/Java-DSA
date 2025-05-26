//import java.util.Collections;

import static java.lang.Math.sqrt;

import java.util.ArrayList;

public class Print_Divisors {

    public static ArrayList<Integer> printDivisorNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i); // i is a divisor
                if (i != num / i) {
                    list.add(num / i); // paired divisor
                }
            }
        }

        // Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int num = 36;
        ArrayList<Integer> divisors = printDivisorNumber(num);
        System.out.println("Divisors of " + num + " are: " + divisors);
    }
}
