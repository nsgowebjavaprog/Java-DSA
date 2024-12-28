class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        int max[] = new int[1];
        height(root, max);
        return (max[0]);
    }
    private int height(Node node, int max[]){
        if(node == null) {
            return 0;
        }
        int l = height(node.left, max);
        
        int r = height(node.right, max);
        max[0] = Math.max(max[0], l+r);
        return 1+Math.max(l,r);
    }
}