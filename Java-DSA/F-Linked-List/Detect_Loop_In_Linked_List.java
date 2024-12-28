public class Detect_Loop_In_Linked_List {
    public static boolean detectloop(Node head){
     Node slow = head;
     Node fast = head;
     
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
     }
     return false;
    }
    }
