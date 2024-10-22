// Sum of All Digits
public class Sum_Dig_Of_Num {
    public static int sum_Of_digit(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sum_Of_digit(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of Digit of a Number is: " + sum_Of_digit(num));// Sum of Digit of a Number is: 15
    }
}
