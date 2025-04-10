import java.util.ArrayList;
import java.util.List;

// Define the TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Pre_Order {

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderHelper(root, list);
        return list;
    }

    private static void preOrderHelper(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val); // Visit root
        preOrderHelper(node.left, list); // Traverse left
        preOrderHelper(node.right, list); // Traverse right
    }

    public static void main(String[] args) {
        // Sample binary tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preOrderTraversal(root);
        System.out.println("Preorder traversal: " + result);
    }
}
