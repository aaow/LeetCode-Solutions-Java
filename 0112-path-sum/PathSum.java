/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/24 17:42
 * <p>
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * 给定一棵二叉树和一个整数targetSum的root，如果树的根到叶路径相加等于targetSum，则返回true。
 * <p>
 * A leaf is a node with no children.
 * 叶子是没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * <p>
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 * Example 2:
 * 示例2：
 * <p>
 * <p>
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There are two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 * Example 3:
 * 示例3：
 * <p>
 * Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there are no root-to-leaf paths.
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * 树中的节点数在范围[0, 5000]。
 * -1000 <= Node.val <= 1000
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * -1000 <= targetSum <= 1000
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        return leftSum || rightSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        PathSum pathSum = new PathSum();
        System.out.println(pathSum.hasPathSum(root, 7));
    }
}
