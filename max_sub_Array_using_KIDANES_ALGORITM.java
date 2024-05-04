// 11. Max SubArray Using KIDANE'S ALGOTITM

public class max_sub_Array_using_KIDANES_ALGORITM.java {
   public static void KADANES_max_sub_array_sum(int numbers[]){

       int max_sum =Integer.MIN_VALUE;
       int curr_sum = 0;

       for (int i = 0; i < numbers.length ; i++) {
           curr_sum = curr_sum + numbers[i];
           if (curr_sum < 0) {

               curr_sum = 0;
           }
           max_sum = Math.max(curr_sum,max_sum);
       }
       System.out.println("Max of sub array is :"+max_sum);
   }

   public static void main(String[] args) {
       int numbers [] = {-2,-3,4,-1,-2,1,5,-3};   //  Max of sub array is :7
       KADANES_max_sub_array_sum(numbers);
   }
}