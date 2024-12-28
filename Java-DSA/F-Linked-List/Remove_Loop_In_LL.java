public class Remove_Loop_In_LL {

    class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
       
       // Create a hash set and store node in hash-set
       
       HashSet<Node> set = new HashSet<>();
       Node temp = head;
       
       while(temp != null){
           // node inside the set then loop start-Nsloni
           if(set.contains(temp.next)){
               temp.next = null;
               break;
           }
           set.add(temp);
           temp = temp.next;
       }
        
     }
    }

}