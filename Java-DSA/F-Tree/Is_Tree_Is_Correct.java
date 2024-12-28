class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return bst(root, min, max);
    }
    public static boolean bst(Node root, int min, int max){
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        return bst(root.left, min, root.data) && bst(root.right, root.data, max);
    }
}