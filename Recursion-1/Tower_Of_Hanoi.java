//15.Tower of Hanoi
public class Tower_Of_Hanoi {
    public static void tower_og_Hanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Transfer From " + src + " To " + dest);
            return;
        }
        tower_og_Hanoi(n - 1, src, dest, help);
        System.out.println("Transfer From " + src + " To " + dest);
        tower_og_Hanoi(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        tower_og_Hanoi(3, "S", "H", "D");
    }
}
// Transfer From S To D
// Transfer From S To H
// Transfer From D To H
// Transfer From S To D
// Transfer From H To S
// Transfer From H To D
// Transfer From S To D
