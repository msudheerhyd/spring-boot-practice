package blind75;

public class BalancedBinaryTree {

    public static boolean balancedBinaryTree(TreeNode root) {
        return getHeight(root) != Integer.MAX_VALUE;
    }

    private static int getHeight(TreeNode node) {
        if(node == null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if(left == Integer.MAX_VALUE ||
                right == Integer.MAX_VALUE || Math.abs(left - right) > 1) {
            return Integer.MAX_VALUE;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(9);
        TreeNode q = new TreeNode(20);
        TreeNode r = new TreeNode(15);
        TreeNode s = new TreeNode(7);

        root.left = p;
        root.right = q;
        q.left = r;
        q.right = s;
        System.out.println(balancedBinaryTree(root));
    }
}
