// This is a list
// ArrayList v/s Linked List
// ArrayList--->Dynamic array increase/decrease array size insert at any position
// Insert-->O(n)  Search--->O(1)

// 2.LinkedList----->Non-Contiguous link with one two another temp,head,tail,null
// insert at any position--->using temp,head etc......,
// Insert----> O(1)  Search--->O(n)

// 1.Variable Size---> Not Fixed
// Non-Contiguous Memory
// Insert----> O(1)
// Search--->O(n)
// NODE------> {[(data|next)]},
// Eg: {[(1|100)]} --------> {[(2|200)]} --------> {[(3|300)]}
// 1.Single_Linked-List 2.Double_Linked-List  3.Circular_Linked-List

// 1 OPERATIONS

//import java.util.LinkedList;
/*
class LiNKED_LiST{

  Node head;
  private int size;

  // size
  LiNKED_LiST(){
      this.size = 0;
  }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
//add------> first
public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
}

//add------> last
public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node currNode = head;
    while (currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
}

// del first
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // del last
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        // more than 2 recursion

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

// print
    public void printList(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //size
    public int getSize(){
      return size;
    }



    public static void main(String[] args) {
        LiNKED_LiST list = new LiNKED_LiST();

         //add

        list.addFirst("LONI");
        list.addFirst("NS");

        list.printList();
        System.out.println(list.getSize());
        list.addFirst("NS "); // 2


         // delete

        list.deleteFirst();
        list.printList();   //LONI-->NULL

        list.deleteFirst();
        list.printList();   // List is empty

         //size
        System.out.println(list.getSize());
        list.addFirst("This is ");

    }
}*/
//add
// OUTPUT: NS-->LONI-->NULL

//del
//OUTPUT:

//Frame_Work

// 2
import java.util.*;
class LiNKED_LiST{
    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<String>();
// 1.add
        list.addFirst("AS");
        list.addFirst("IS");
        System.out.println(list);  // [IS, AS]

        list.addLast("LAST");
        System.out.println(list);    // [IS, AS, LAST]

// 2.size
        System.out.println(list.size());  // 3

// 3.for
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+"-->");  // IS-->AS-->LAST-->null
        }
        System.out.println("null");

// 4. remove
        list.removeFirst();
        System.out.println(list); // [AS, LAST]

        list.removeLast();
        System.out.println(list);  // [AS]

        /*list.removeLast();
        System.out.println(list);*/   // []

// 5. add and remove at IDX

        list.remove(1);
        System.out.println(list);

    }
}