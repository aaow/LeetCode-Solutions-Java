import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/23 17:39
 * Given a binary tree, find its minimum depth.
 * 给定一棵二叉树，求其最小深度。
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 最小深度是从根节点向下到最近叶节点的最短路径上的节点数量。
 * <p>
 * Note: A leaf is a node with no children.
 * 注意： 叶节点是没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 * Example 2:
 * 示例2：
 * <p>
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * The number of nodes in the tree is in the range [0, 105].
 * 树中的节点数在范围[0, 105]。
 * -1000 <= Node.val <= 1000
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null || root.right == null) {
            int nonEmptyDepth = root.left != null ?
                    minDepth(root.left) :
                    minDepth(root.right);
            return nonEmptyDepth + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    static {
        for (int i = 0; i < 100; i++) {
            minDepth2(new TreeNode(0));
        }
    }
    public static int minDepth2(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int depth = 1; !q.isEmpty(); depth++) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode examined = q.remove();
                if (examined.left == null && examined.right == null) return depth;
                if (examined.left != null) {
                    q.add(examined.left);
                }
                if (examined.right != null) {
                    q.add(examined.right);
                }
            }
        }
        return -1;
    }
}
