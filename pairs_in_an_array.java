// 8.Pairs in an Array        n(n-1)/2  T.C == O(n^2)

public class pairs_in_an_array {
   public static void print_pairs(int numbers[]){

       int total_pairs=0;

       for (int i=0; i< numbers.length; i++){
           int curr = numbers[i];
           for (int j = i+1; j <numbers.length ; j++) {
               System.out.print("("+curr+","+ numbers[j]+")  ");
               total_pairs ++;
           }
           System.out.println();
       }
       System.out.println("Total Pairs : "+total_pairs);   // Total Pairs : 10
   }

   public static void main(String[] args) {
       int numbers[]={2,4,6,8,10};
       print_pairs(numbers);

   }
}