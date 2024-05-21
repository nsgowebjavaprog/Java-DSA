/*
import java.util.Stack;

// infix expressions
public class STACK {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);  // [10, 20, 30, 40, 50, 60]

        // peek

        System.out.println(st.peek()); //60

        // pop
        System.out.println(st);
        System.out.println(st.pop()); // 60

        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.size());  // 2

        System.out.println(st.isEmpty()); //false

    }
}
*/
// 2.Copy Stack
/*
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;


public class STACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
         int n;
        System.out.println("Enter the size: ");
        n=sc.nextInt();
        System.out.println("Enter the element: ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            stack.push(x);
        }
        System.out.println(stack);
    }
}
// OUTPUT:
Enter the size:
        4
Enter the element:
         1 2 3 4
        [1, 2, 3, 4]*/

// 3.Copy Element in Reverse Order
/*
public class STACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        // reverse\
        Stack<Integer> rev_stack = new Stack<>();
        while(stack.size() > 0){
            int x= stack.peek();
            rev_stack.push(x);
            stack.pop();
        }
        System.out.println(rev_stack);
    }
}
*/
// OUTPUT:
/*
[10, 20, 30, 40, 50]
        [50, 40, 30, 20, 10]*/

// 4.Insert at Bottom/ any index
/*
import java.util.Stack;
public class STACK {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        int idx = 2;
        int x = 1121212121;
        Stack<Integer> temp = new Stack<>();

        while (stack.size() > idx) {
            temp.push(stack.pop());
        }
        stack.push(x);
            while (temp.size() > 0) {
                stack.push(temp.pop());
            }
            System.out.println(stack);
        }
    }
    */
//[10, 20, 30, 40, 50]
//[10, 20, 1121212121, 30, 40, 50]


// Collection Framework
/*
import java.util.*;
public class STACK {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        System.out.println(st);  // [11, 22, 33]
        // reverse of stack
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();  //  [33 22 11]
        }
    }
}
*/



//push at bottom of the stack
/*
import java.util.Stack;
// insert the eleement in botton {or} idx of [0]
public class STACK {
    public static void push_at_bottom(Stack<Integer> st, int data) {
        //recursion start
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        push_at_bottom(st,data);
        st.push(top);
        //recursion end
    }
// initially it's===>  5 1 2 3

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        push_at_bottom(st,5);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
*/
/*
3
2
1
5*/

// REVERSE A STACK
// 1st popo ele then empty stack then enter the ele ---> reverse

/*
import java.util.Stack;

public class STACK {
    public static void push_at_bottom(Stack<Integer> st, int data){
        // when 0 ele
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        // more ele
        int top = st.pop();
        push_at_bottom(st, data);
        st.push(top);
    }

    public static void reverse_stack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse_stack(st);
        push_at_bottom(st, top); // Corrected here
    }

    public static void print_stack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(444);
        st.push(333);
        st.push(222);
        st.push(111);
        reverse_stack(st);
        print_stack(st);
    }
}
*/
// REVERSE A STACK
/*
import java.util.Stack;

public class STACK {
    public static void push_at_bottom(Stack<Integer> st, int data){
        // when 0 ele
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        // more ele
        int top = st.pop();
        push_at_bottom(st, data);
        st.push(top);
    }

    public static void reverse_stack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse_stack(st);
        push_at_bottom(st, top);
    }

    public static void print_stack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(111);
        st.push(222);
        st.push(333);
        st.push(444);
        reverse_stack(st);
        print_stack(st);
    }
}*/

// reverse display stack
/*
import java.util.Stack;
public class STACK {
    public static void display_reverse(Stack<Integer> st){

        if(st.size() == 0)  // initial {or} finally it's NULL
            return;

        // recursion
    int top = st.pop();  // display top ele

        System.out.print(top+" ");    // remaining element---> [{n-1}]

        display_reverse(st);  //  next recursion

        st.push(top);  // o/p
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.print("Reverse of Stack As FOLLOWING: ");
        display_reverse(st);
    }
}
// Reverse of Stack As FOLLOWING---> 50 40 30 20 10
*/

// remove from bottom
/*
import java.util.Stack;
public class STACK {
    public static void display_reverse(Stack<Integer> st,Stack<Integer> rt){
       while (st.size()>1){
           rt.push(st.pop());
       }
       st.pop();
       while (rt.size()>0){
           st.push(rt.pop());
       }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.print("remove @ bottom: ");
        display_reverse(st);
        display_reverse(rt);
    }
}*/

// reverse stack
/*
import java.util.Stack;

//reverse(st){
//    int top = st.pop();
//    reverse(st);
//    push_at_bottom(top);  // top ele already pop that's push @ botttom
//}
// 4,3,2,1 pop(4) --> 3,2,1 pop(3) ---> 2,1 pop(2) ---> 1---->>> push_at_bottom
//
//
public class STACK {
    public static void push_at_bottom(Stack<Integer> st, int x){
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        push_at_bottom(st,x);
        st.push(top);
        }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;

        int top = st.pop();
        reverse(st);
        push_at_bottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
[11, 22, 33, 44, 55]
        [55, 44, 33, 22, 11]*/

// UNDERFLOW
/*
import java.util.Stack;

public class STACK {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(14);
        st.push(13);
        st.push(12);
        st.push(11);
        st.push(10);
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //   st.pop();
        // System.out.println(st); // error------>UNDERFLOW
    }
}*/
/*
// 12.ARRAY IMPLEMENTATION OF SSTACKS

import java.util.Stack;

//stack[0] = array[0]
// pop,push,peek,size,isEmpty,isFull,capacity
public class STACK {

    // PUSH
  public class stack_array{
      private  int[] arr = new int[5];
      private int idx = 0;
      void push(int x) {
          if (idx < arr.length) {
              arr[idx] = x;
              idx++;
          }else {
              System.out.println("Stack is full");
          }
      }
      int peek(){
          if(idx == 0){
              System.out.println("Stack is empty");
              return -1;
          }
          return arr[idx-1];
      }
      int pop(){
          if(idx==0){
              System.out.println("stack is empty");
              return -1;
          }
          int top = arr[idx-1];
          arr[idx-1] = 0;
          idx--;
          return top;
      }
      void display(){
          for(int i=0; i<=idx-1; i++){
              System.out.print(arr[i]+" ");
          }
          System.out.println();
      }
      int size() {
          return idx;
      }

          boolean isEmpty(){
              return idx == 0;
          }
          boolean isFull(){
              return idx == arr.length;
          }
          int capacity(){
              return arr.length;
          }
  }

    public static void main(String[] args) {

        STACK.stack_array st = new STACK().new stack_array();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println("Size: " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());
        System.out.println("Is Full: " + st.isFull());
        System.out.println("Capacity: " + st.capacity());

//        Stack st = new Stack();
//        st.push(4);
//        st.push(5);
//        st.push(1);
//        st.display();         // 4 5 1
//        System.out.println(st.size());  // 3
//        st.pop();
//        st.display();      // 4 5
    }
}*/
/*
4 5 1
Size: 3
Is Empty: false
Is Full: false
Capacity: 5  */

// 13. linked list implimentation using STACK

