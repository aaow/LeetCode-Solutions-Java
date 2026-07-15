/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/15 15:47
 *
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * 给定两棵二叉树p和q的根，写一个函数检查它们是否相同。
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * 如果两个二叉树在结构上相同且节点值相同，则它们被视为相同的。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 *
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * Example 2:
 * 示例2：
 *
 *
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * Example 3:
 * 示例3：
 *
 *
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 *
 * Constraints:
 * 限制条件：
 *
 * The number of nodes in both trees is in the range [0, 100].
 * 两棵树的节点数都在[0, 100]范围内。
 * -104 <= Node.val <= 104
 * -104 <= Node.val <= 104
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(4);
        node2.left = new TreeNode(5);

        SameTree sameTree = new SameTree();
        System.out.println(sameTree.isSameTree(node1, node2));
    }
}
