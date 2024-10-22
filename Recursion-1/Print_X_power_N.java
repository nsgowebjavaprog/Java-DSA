//Find X_Power_n = X^n
public class Print_X_power_N {
    public static int xPowerN(int x, int n) { // 2^5 = 2*2*2*2*2 = 32
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }
        int xPowerNm1 = xPowerN(x, n - 1);
        int xPowN = x * xPowerNm1;
        return xPowN;
    }

    public static void main(String[] args) { // 32
        int res = xPowerN(2, 5);
        System.out.println(res);
    }
}
