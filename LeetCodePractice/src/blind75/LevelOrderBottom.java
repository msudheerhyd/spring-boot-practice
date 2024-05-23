package blind75;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> values = new LinkedList<>();
            int size = queue.size();

            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                values.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(0, values);
        }
        return result;
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

        System.out.println(levelOrderBottom(root));
    }
}
