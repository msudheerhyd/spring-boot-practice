package blind75;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(3);
        TreeNode r = new TreeNode(4);
        TreeNode s = new TreeNode(5);
        TreeNode t = new TreeNode(6);
        TreeNode u = new TreeNode(7);


        root.left = p;
        root.right = q;
        p.left = r;
        p.right = s;
        q.left = t;
        q.right = u;

        System.out.println(invertTree(root));

    }
}
