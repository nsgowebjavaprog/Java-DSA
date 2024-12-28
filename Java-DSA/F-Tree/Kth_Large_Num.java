// ----> return as.get(as.size() - K): Returns the kth largest element, which is the element at index as.size() - K in the sorted ArrayList.

/*
                                                3.  Kth largest element in BST
Difficulty: EasyAccuracy: 49.31%Submissions: 161K+Points: 2
Given a Binary Search Tree. Your task is to complete the function which will return the kth largest element without doing any modification in the Binary Search Tree.

Examples:

1. Input:
      4
    /   \
   2     9
k = 2 
Output: 4
Explanation: 2nd Largest element in BST is 4


2. Input:
       9
        \ 
          10
k = 1
Output: 10
Explanation: 1st Largest element in BST is 10


3. Input:
      4
    /   \
   2     9
k = 3 
Output: 2
Explanation: 3rd Largest element in BST is 2
 */

import java.util.ArrayList;

import org.w3c.dom.Node;

class Solution {
    void check(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        check(root.left, ans);
        ans.add(root.data);
        check(root.right, ans);
    }

    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        check(root, ans);
        return ans.get(ans.size() - k);
    }
}