public class Check_Even_Or_Odd {
    public static void main(String[] args) {
        int n = 10;
        if ((n & 1) == 0) {
            System.out.println(n + " is Even number");
        } else {
            System.out.println(n + " is Odd Number");
        }
    }
}
// Time Complexity : O(1)
// Space Complexity : (1)