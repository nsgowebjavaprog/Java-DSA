/*
 Left View of Binary Tree
Difficulty: EasyAccuracy: 33.74%Submissions: 532K+Points: 2
You are given the root of a binary tree. Your task is to return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

If the tree is empty, return an empty list.

Examples :

Input: root[] = [1, 2, 3, 4, 5, N, N]

Output: [1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.
 
 */

import java.util.ArrayList;
import java.util.List;


class Solution {
    void resultView(Node root, int level, List<Integer> res) {
        if (root == null) return;
        if (res.size() == level) res.add(root.data);
        resultView(root.left, level + 1, res);
        resultView(root.right, level + 1, res);
    }

    List<Integer> leftView(Node root) {
        List<Integer> res = new ArrayList<>();
        resultView(root, 0, res);
        return res;
    }

}