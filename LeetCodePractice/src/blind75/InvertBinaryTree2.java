package blind75;

import com.sun.source.tree.Tree;

public class InvertBinaryTree2 {

    public static TreeNode invertBinaryTree(TreeNode root) {
        if(root == null)  return null;

        TreeNode left = invertBinaryTree(root.left);
        TreeNode right = invertBinaryTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(7);
        TreeNode r = new TreeNode(1);
        TreeNode s = new TreeNode(3);
        TreeNode t = new TreeNode(6);
        TreeNode u = new TreeNode(9);

        root.left = p;
        root.right = q;
        p.left = r;
        p.right = s;
        q.left = t;
        q.right = u;

        System.out.println(invertBinaryTree(root));
    }
}
