//Print "N" Times
public class Print_N_Times {
    public static void print_n_Times(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("GM");
        print_n_Times(i+1, n);
    }
    public static void main(String[] args) {
        print_n_Times(1,4);
    }
}
