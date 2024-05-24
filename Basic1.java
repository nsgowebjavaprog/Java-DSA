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
  }
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
  
          list.removeLast();
          System.out.println(list);  // []
  
  // 5. add and remove at IDX
  
          list.remove(1);
          System.out.println(list);
  
      }
  }
  
  
  // 3 Reverse a Linked List
  
  // [1]--->[2]--->[3]--->[4]--->null
  
  // null<----[1]<---[2]<---[3]<---[4]  {or}
  // [4]--->[3]--->[2]--->[1]--->null
  
  
  // 1 Basic
  
  public class LiNKED_LiST {
      public static class Node{
          int data;
          Node next;
          public Node(int data){
              this.data = data;
              this.next = null;
          }
      }
      public static Node head;
      public static Node tail;
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.head = new Node(10);
          ll.head.next = new Node(100);
          System.out.println();
      }
  }
  
  // operation on adding del and print in SLL
  
  public class LiNKED_LiST{
      Node head;
      Node tail;
      // create a class node
      class Node {
          String data;
          Node next;
  
          Node(String data) {
              this.data = data;
              this.next = null;
          }
      }
  
      public void add_First(String data) {
          // create new node
          Node newnode = new Node(data);
          if (head == null) {
              head = newnode;
              return;
          }
          newnode.next = head;  // link
          head = newnode;
      }
  
      // print ll
      public void printLL() {
          // no Node
          Node temp = head;
          if (head == null) {
              System.out.println("LL is empty");
              return;
          }
  
          while (temp != null) {
              System.out.print(temp.data + "------->");
              temp = temp.next;
          }
          System.out.println("NULL");
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.add_First("Engineering");
          ll.add_First("Computer Science");
          ll.add_First("BE");
          ll.add_First("Loni");
          ll.add_First("S");
          ll.add_First("Nagaraj");
          ll.printLL();
      }
  }
  // output: Nagaraj------->S------->Loni------->BE------->Computer Science------->Engineering------->||
  
  
  
      // add last
  public void addd_Last(String data){
          Node newnode = new Node(data);
          if(head == null){
              head = newnode;
              return;
          }
          tail.next = newnode;
          newnode = tail;
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.addd_Last("Bijapur");
          ll.addd_Last("Karnataka");
      }
  }
  
        // add first
  public void add_First(String data){
           // create new node
          Node newnode = new Node(data);
          if(head== null){
              head = newnode;
              return;
          }
          newnode.next = head;  // link
          head = newnode;
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.add_First("Ns");
          ll.add_First("LONI");
          System.out.println(ll);
      }
  }
  
  // add @ middle
  // (index,data)
  // O(N)
  //  {}-{newnode}-{}--{}--{}
  // same as add_First
  
  //add middle {add_First, print, Node}
  
  public class LiNKED_LiST {
      Node head;
      Node tail;
      // create a class node
      class Node {
          String data;
          Node next;
  
          Node(String data) {
              this.data = data;
              this.next = null;
          }
      }
  
      // add _first
      public void add_First(String data) {
          Node newnode = new Node(data);
          if (head == null) {
              head = newnode;
              return;
          }
          newnode.next = head;  // link
          head = newnode;
      }
  
      // print ll
      public void printLL() {
          // no Node
          Node temp = head;
          if (head == null) {
              System.out.println("LL is empty");
              return;
          }
  
          while (temp != null) {
              System.out.print(temp.data + "->");
              temp = temp.next;
          }
          System.out.println(".");
      }
  
      public void add_at_position(int idx, String data) {
          if (idx == 0) {
              add_First(data);
              return;
          }
          Node newnode = new Node(data);
          Node temp = head;
          int i = 0;
          while (temp.next != null && i < idx - 1) {
              temp = temp.next;
              i++;
          }
          if (temp.next == null) {
              System.out.println("Index out of bounds");
              return;
          }
          newnode.next = temp.next;
          temp.next = newnode;
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.add_First("LONI");
          ll.add_First("NS");
          ll.add_at_position(0, "Hi");
          ll.printLL();
      }
  }
  // output:  Hi->NS->LONI->.
  
  // REMOVE
  
  // first _ Remove
  public class LiNKED_LiST {
      private int size;
      LiNKED_LiST() {
          this.size = 0;
      }
      Node head;
      Node tail;
      // create a class node
      class Node {
          String data;
          Node next;
  
          Node(String data) {
              this.data = data;
              this.next = null;
          }
      }
  
      // add _first
      public void add_First(String data) {
          Node newnode = new Node(data);
          if (head == null) {
              head = newnode;
              tail = newnode;
          } else {
              newnode.next = head;  // link
              head = newnode;
          }
          size++;
      }
  
      // print ll
      public void printLL() {
          // no Node
          Node temp = head;
          if (head == null) {
              System.out.println("LL is empty");
              return;
          }
  
          while (temp != null) {
              System.out.print(temp.data + "->");
              temp = temp.next;
          }
          System.out.println(".");
      }
  
      // remove first
      public String remove_First() {
          if (size == 0) {
              System.out.println("LL is Empty");
              return "";
          }
          String val = head.data;
          if (head.next == null) {
              head = null;
              tail = null;
          } else {
              head = head.next;
          }
          size--;
          return val;
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.add_First("LONI");
          ll.add_First("NS");
          ll.add_First("Hi");
  
          ll.printLL();
          ll.remove_First();
          ll.printLL();
      }
  }
  // OUTPUT:     Hi->NS->LONI->.
  //             NS->LONI->.
  
  
  
  // REMOVE LAST
  public class LiNKED_LiST {
      private int size;
      LiNKED_LiST() {
          this.size = 0;
      }
      Node head;
      Node tail;
      // create a class node
      class Node {
          String data;
          Node next;
  
          Node(String data) {
              this.data = data;
              this.next = null;
          }
      }
  
      // add _first
      public void add_First(String data) {
          Node newnode = new Node(data);
          if (head == null) {
              head = newnode;
              tail = newnode;
          } else {
              newnode.next = head;  // link
              head = newnode;
          }
          size++;
      }
  
      // print ll
      public void printLL() {
          // no Node
          Node temp = head;
          if (head == null) {
              System.out.println("LL is empty");
              return;
          }
  
          while (temp != null) {
              System.out.print(temp.data + "->");
              temp = temp.next;
          }
          System.out.println(".");
      }
  
      // remove LAST
      public String remove_last() {
          if (size == 0) {
              System.out.println("LL is Empty");
              return "";
          } else if (size == 1) {
              String val = head.data;
              head = tail = null;
              size = 0;
              return val;
          } else {
              Node prev = head;
              for (int i = 0; i < size - 2; i++) {
                  prev = prev.next;
              }
              String val = prev.next.data;
              prev.next = null;
              tail = prev;
              size--;
              return val;
          }
      }
  
      public static void main(String[] args) {
          LiNKED_LiST ll = new LiNKED_LiST();
          ll.add_First("LONI");
          ll.add_First("NS");
          ll.add_First("Hi");
  
          ll.printLL();
          ll.remove_last();
          ll.printLL();
      }
  }
  
  //  Hi->NS->LONI->.
  //  Hi->NS->.
  
  
  
  
  
  
  
  
  
  
