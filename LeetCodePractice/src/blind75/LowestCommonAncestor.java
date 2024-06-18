package blind75;

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;

        while(node != null) {
            if(node == p || node == q) return node;

            boolean pIsOnLeft = p.val < node.val;
            boolean qIsOnLeft = p.val < node.val;

            if(pIsOnLeft != qIsOnLeft) {
                return node;
            } else {
                node = pIsOnLeft ? node.left : node.right;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode r = new TreeNode(0);
        TreeNode s = new TreeNode(4);
        TreeNode t = new TreeNode(7);
        TreeNode u = new TreeNode(9);
        TreeNode v = new TreeNode(3);
        TreeNode w = new TreeNode(5);

        root.left = p;
        root.right = q;
        p.left = r;
        p.right = s;
        q.left = t;
        q.right = u;
        s.left = v;
        s.right = w;

        System.out.println(lowestCommonAncestor(root, p, q));
    }
}
