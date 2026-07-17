/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/17 15:39
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * 给定二叉树的root，返回其最大深度。
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 二叉树的最大深度 是从根节点向下延伸到最远叶节点的最长路径上的节点数。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 * 示例2：
 * <p>
 * Input: root = [1,null,2]
 * Output: 2
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * The number of nodes in the tree is in the range [0, 104].
 * 树中的节点数在范围[0, 104]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;

        }
        int leftDepth = maxDepth(root.left);
        System.out.println("leftDepth..."+leftDepth);
        int rightDepth = maxDepth(root.right);
        System.out.println("rightDepth..."+rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
    }
}
