/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/17 14:05
 *
 *
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 给定二叉树的 root，检查它是否是自身的镜像（即围绕中心对称）。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 *
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * Example 2:
 * 示例2：
 *
 *
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 *
 *
 * Constraints:
 * 限制条件：
 *
 * The number of nodes in the tree is in the range [1, 1000].
 * 树中的节点数在范围[1, 1000]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 *
 *
 * Follow up: Could you solve it both recursively and iteratively?
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);
        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(root));
    }


}
