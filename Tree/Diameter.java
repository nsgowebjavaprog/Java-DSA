class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Diameter {

    public static int dia_meter(TreeNode root) {
        int max[] = new int[1];
        height(root, max);
        return max[0];
    }

    private static int height(TreeNode root, int max[]) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left, max);
        int r = height(root.right, max);

        max[0] = Math.max(max[0], l + r);

        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(43);

        System.out.println(dia_meter(root));
    }
}