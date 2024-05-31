package blind75;

public class MinimumDepthBinary {

    public static int minDepthBinary(TreeNode root) {
        return root == null ? 0 : getMin(root);
    }

    private static int getMin(TreeNode node) {
        if(node == null) return Integer.MAX_VALUE;
        if(node.left == null && node.right == null) return 1;

        return Math.min(getMin(node.left), getMin(node.right)) + 1;
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

        System.out.println(minDepthBinary(root));
    }
}
