class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Max_Path_Sum {

    public static int max_path_sum(TreeNode root) {
        int max_val[] = new int[1];

        max_val[0] = Integer.MIN_VALUE;
        path_sum(root, max_val);
        return max_val[0];
    }

    private static int path_sum(TreeNode root, int max_val[]) {
        if (root == null) {
            return 0;
        }
        int l = Math.max(0, path_sum(root.left, max_val));
        int r = Math.max(0, path_sum(root.right, max_val));

        max_val[0] = Math.max(max_val[0], l + r + root.val);

        return Math.max(l, r) + root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(21);
        root.left = new TreeNode(23);
        root.right = new TreeNode(543);
        root.left.left = new TreeNode(5433);

        System.out.println(max_path_sum(root));
    }
}