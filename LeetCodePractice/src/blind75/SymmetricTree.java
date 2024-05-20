package blind75;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode s = new TreeNode(4);
        TreeNode t = new TreeNode(4);
        TreeNode u = new TreeNode(3);

        root.left = p;
        root.right = q;
        p.left = r;
        p.right = s;
        q.left = t;
        q.right = u;

        System.out.println(isSymmetric(root));
    }
}
