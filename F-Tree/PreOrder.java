/*
                                                        2. Preorder Traversal

 Given a binary tree, find its preorder traversal.

Examples:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: [1, 4, 4, 2]
Input:
       6
     /   \
    3     2
     \   / 
      1 2
Output: [6, 3, 1, 2, 2] 
Input:
         8
       / \
      3   10
     / \    \
    1   6   14
       / \   /
      4   7 13
Output: [8, 3, 1, 6, 4, 7, 10, 14, 13]
 */

import java.util.ArrayList;

import org.w3c.dom.Node;

class Solution {
    void PreOrder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        ans.add(root.data);
        PreOrder(root.left, ans);
        PreOrder(root.right, ans);
    }

    // Function to return a list containing the preorder traversal of the tree.
    ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> ans = new ArrayList<>();
        PreOrder(root, ans);
        return ans;
    }
}