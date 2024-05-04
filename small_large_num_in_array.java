// 5 smallest and largest

public class small_large_num_in_array {
   public static int Get_Large(int numbers[]){
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;

       for (int i=0;i< numbers.length; i++){
           if (largest < numbers[i]){
               largest = numbers[i];
           }
           if (smallest > numbers[i]){
               smallest = numbers[i];
           }
       }
       System.out.println("Smallest is :"+smallest);    //Smallest is :2
       return  largest;
   }

   public static void main(String[] args) {    // Greatest Number : 9
       int numbers[] = {2,4,7,9,5,4,2};
       System.out.println("Greatest Number : "+Get_Large(numbers));
   }
}