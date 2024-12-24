/*
Height of Binary Tree
Difficulty: EasyAccuracy: 78.58%Submissions: 293K+Points: 2
Given a binary tree, find its height.

The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children.

Examples:

Input: root[] = [12, 8, 18, 5, 11] 
 
Output: 2
Explanation: The longest path from the root (node 12) goes through node 8 to node 5, which has 2 edges.
*/

import org.w3c.dom.Node;

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here 
        if (node == null) {
            return 0;
        }
        if (node != null && node.left == null && node.right==null) {
            return 0;
        }
        
        int leftH = height(node.left);
        int rightH = height(node.right);
        
        return Math.max(leftH, rightH) + 1;
    }
}