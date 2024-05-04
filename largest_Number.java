// 4. Largest Number

public class largest_Number{
   public static int Get_Large(int numbers[]){
       int largest = Integer.MIN_VALUE;

       for (int i=0;i< numbers.length; i++){
           if (largest < numbers[i]){
               largest = numbers[i];
           }
       }
       return  largest;
   }

   public static void main(String[] args) {    // Greatest Number : 9
       int numbers[] = {2,4,7,9,5,4,2};
       System.out.println("Greatest Number : "+Get_Large(numbers));
   }
}