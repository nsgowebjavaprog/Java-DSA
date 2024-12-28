/*
 Right View of Binary Tree

 Given a Binary Tree, Your task is to return the values visible from Right view of it.

Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Examples :

Input: root = [1, 2, 3, 4, 5]
     2_2
Output: [1, 3, 5]

*/

class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        right_view(root, list, 0);
        return list;
    }

    private void right_view(Node root, ArrayList<Integer> list, int curr_level) {
        if (root == null)
            return;
        if (curr_level == list.size()) {
            list.add(root.data);
        }
        right_view(root.right, list, curr_level + 1);
        right_view(root.left, list, curr_level + 1);
    }

}