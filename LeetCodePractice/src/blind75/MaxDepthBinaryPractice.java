package blind75;

public class MaxDepthBinaryPractice {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(20);
        TreeNode r = new TreeNode(5);
        TreeNode s = new TreeNode(6);

        root.left = p;
        root.right = q;
        q.left = r;
        q.right = s;

        System.out.println(maxDepth(root));

    }
}
