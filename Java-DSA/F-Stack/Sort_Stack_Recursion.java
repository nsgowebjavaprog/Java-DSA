/*
               How to Sort a Stack using Recursion
Last Updated : 13 Mar, 2023
Given a stack, the task is to sort it using recursion.

Example: 


Input: elements present in stack from top to bottom -3 14 18 -5 30
Output: 30 18 14 -3 -5
Explanation: The given stack is sorted know 30 > 18 > 14 > -3 > -5


Input: elements present in stack from top to bottom 1 2 3
Output: 3 2 1
Explanation: The given stack is sorted know 3 > 2 > 1
 */

import java.util.Stack;

public class Sort_Stack_Recursion {

    static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            sortedInsert(s, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(-5);
        s.push(14);
        s.push(18);
        s.push(-3);
        s.push(30);

        System.out.println("Stack elements before sorting: ");
        System.out.println(s);

        sortStack(s);

        System.out.println("Stack elements after sorting: ");
        System.out.println(s);
    }

}

// ----------------------------------------------- 0R
// ----------------------------------------------

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> temp_st = new Stack<>();
        // Continue until the input stack is empty
        while (!s.isEmpty()) {
            // Pop out the first element from the input stack
            int temp = s.pop();
            // While the temporary stack is not empty and the top of the temporary stack is
            // greater than tmp
            while (!temp_st.isEmpty() && temp_st.peek() > temp) {
                // Pop from the temporary stack and push it to the input stack
                s.push(temp_st.pop());
            }
            // Push tmp into the temporary stack
            temp_st.push(temp);
        }
        // Return the sorted temporary stack
        return temp_st;
    }
}