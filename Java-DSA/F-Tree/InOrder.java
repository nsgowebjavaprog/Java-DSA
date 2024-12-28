
/*
                                                           1. Inorder Traversal
Difficulty: BasicAccuracy: 67.15%Submissions: 162K+Points: 1
Given a Binary Tree, find the In-Order Traversal of it.

Examples:

Input:
       1
     /  \
    3    2
Output: [3, 1, 2]
Explanation: The in-order traversal of the given binary tree is [3, 1, 2].
Input:
        10
     /      \ 
    20       30 
  /    \    /
 40    60  50
Output: [40, 20, 60, 10, 50, 30]
Explanation: The in-order traversal of the given binary tree is [40, 20, 60, 10, 50, 30].
 */
import java.util.*;

import org.w3c.dom.Node;

class Solution {

    void inorder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }

    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;

    }
}