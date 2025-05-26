public class Arm_Strong_Num {

    public static boolean armStrongNumber(int num) {
        int org_num = num;
        int sum = 0;
        while (num > 0) {
            int last_dig = num % 10;
            sum = sum + (last_dig * last_dig * last_dig);
            num = num / 10;
        }
        return (org_num == sum);
    }

    public static void main(String[] args) {
        int num = 34;
        System.out.println("Arm-Strong_Number: " + armStrongNumber(num));
    }
}