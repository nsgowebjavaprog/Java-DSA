class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Low_commn_Ancestor {

    public static TreeNode l_c_m(TreeNode root, int p, int q) {
        if (root == null)
            return null;

        if (root.val == p || root.val == q)
            return root;

        TreeNode left = l_c_m(root.left, p, q);
        TreeNode right = l_c_m(root.right, p, q);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(43);

        TreeNode lca = l_c_m(root, 6, 43);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}