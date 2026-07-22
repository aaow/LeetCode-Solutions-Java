/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/22 16:13
 * Given a binary tree, determine if it is height-balanced.
 * 给定一棵二叉树，确定它是否为 。
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 * 高度平衡二叉树是一种二叉树，其中每个节点的两个子树深度相差不超过一。
 *
 *
 * Example 1:
 * 示例1：
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * Example 2:
 * 示例2：
 *
 *
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * Example 3:
 * 示例3：
 *
 * Input: root = []
 * Output: true
 *
 *
 * Constraints:
 * 限制条件：
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * 树中的节点数在范围[0, 5000]。
 * -104 <= Node.val <= 104
 * -104 <= Node.val <= 104
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return check(root)[0]==1;
    }
    private int[] check(TreeNode node) {
        // 空节点：平衡且高度为0
        if (node == null) {
            return new int[]{1, 0};  // true = 1
        }

        // 获取左右子树的判断结果和高度
        int[] leftResult = check(node.left);
        int[] rightResult = check(node.right);

        // 如果任意一侧不平衡，直接返回 false（但需要传递一个有效高度）
        if (leftResult[0] == 0 || rightResult[0] == 0) {
            return new int[]{0, Math.max(leftResult[1], rightResult[1]) + 1};
        }

        // 检查当前节点是否平衡：左右高度差不超过1
        if (Math.abs(leftResult[1] - rightResult[1]) > 1) {
            return new int[]{0, Math.max(leftResult[1], rightResult[1]) + 1};
        }

        // 当前节点也平衡，返回 true 和该子树高度
        return new int[]{1, Math.max(leftResult[1], rightResult[1]) + 1};
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        boolean b = new BalancedBinaryTree().isBalanced(root);
        System.out.println(b);
    }
}
