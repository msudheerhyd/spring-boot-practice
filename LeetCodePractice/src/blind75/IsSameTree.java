package blind75;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class IsSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q ==null) return true;
        if(p == null || q == null) return false;

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode a1 = new TreeNode(2);
        TreeNode b1 = new TreeNode(3);

        p.left = a1;
        p.right = b1;

        TreeNode q = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode b2 = new TreeNode(3);

        q.left = a2;
        q.right = b2;

        System.out.println(isSameTree(p,q));
    }
}
