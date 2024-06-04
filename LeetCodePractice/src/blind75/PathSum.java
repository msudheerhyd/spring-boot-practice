package blind75;

public class PathSum {

    public static boolean pathSum(TreeNode root, int targetSum) {
        return pathSum(root, 0, targetSum);
    }

    public static boolean pathSum(TreeNode node, int sum, int targetSum) {
        if(node == null) return false;

        sum = sum + node.val;

        if(node.left == null && node.right ==null) {
            return sum == targetSum;
        }
        return pathSum(node.left, sum, targetSum) ||
                pathSum(node.right, sum, targetSum);
    }

    public static void main(String[] args) {
        int targetSum = 4;
        TreeNode root = new TreeNode(1);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(3);
        root.left = p;
        root.right = q;

        System.out.println(pathSum(root, targetSum));
    }
}
