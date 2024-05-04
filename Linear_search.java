// 3.Linear Search                            T-C = 0(n)
// find index of key
//arr = 10,20,30,40,50,60         key=40      idx=3

public class Linear_search {
   public static int linear_Search(int numbers[], int key){

       for(int i=0; i<numbers.length; i++){
           if (numbers[i] == key){
               return  i;
           }
       }
       return -1;
   }

   public static void main(String[] args) {
       int numbers[] = {2,4,6,8,10,13,16,19,20};
       int key = 11;
       int index = linear_Search(numbers, key);

       if (index == -1){
           System.out.println("Not found");    // vNot found [key = 11]
       }else{
           System.out.println("Key @: "+index);   // Key @: 4 [key = 10]
       }
   }
}