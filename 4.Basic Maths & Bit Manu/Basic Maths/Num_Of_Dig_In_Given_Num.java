// import static java.lang.Math.log10;

public class Num_Of_Dig_In_Given_Num {

    public static int numOfDigit(int num) {
        // 1

        // if (num == 0)
        // return 1;
        // return (int) (log10(num) + 1);

        // 2
        int last_dig = 0;
        int count = 0;
        while (num > 0) {
            last_dig = num % 10;
            count = count + 1;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 2010;
        System.out.println("No. of Digits is: " + numOfDigit(num));
    }
}