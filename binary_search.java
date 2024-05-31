// 6.Binary Search   {start,mid,end}
public class binary_search {
   public static int Binary_Search(int numbers[], int key){
       int start = 0, end = numbers.length - 1;

       while(start <= end){
           int mid = (start + end)/2;

           // 3 conditions
           if(numbers[mid] == key){
               return  mid;
            
           }
           if (numbers[mid]<key)
           {
               start = mid +1;
           }else{
               end = mid -1;
           }
       }
       return -1;
   }
   public static void main(String[] args) {
       int numbers[] = {2,4,6,8,10,12,14,16,18};
       int key = 10;
       System.out.println("Idx of Element is : "+Binary_Search(numbers, key));
   }
}
