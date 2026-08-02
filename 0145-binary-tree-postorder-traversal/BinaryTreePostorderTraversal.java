import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/8/2 13:38
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * 给定二叉树的 root，返回其节点值的后序遍历。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: root = [1,null,2,3]
 * Input：root = [1，null，2,3]
 *
 * Output: [3,2,1]
 * 输出：[3,2,1]
 *
 * Explanation:
 * 解释：
 *
 *
 *
 * Example 2:
 * 示例2：
 *
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Input：root = [1,2,3,4,5，null，8，null，null，6,7,9]
 *
 * Output: [4,6,7,5,2,9,8,3,1]
 * 输出：[4,6,7,5,2,9,8,3,1]
 *
 * Explanation:
 * 解释：
 *
 *
 *
 * Example 3:
 * 示例3：
 *
 * Input: root = []
 * 输入：根 = []
 *
 * Output: []
 * 输出：[]
 *
 * Example 4:
 * 示例4：
 *
 * Input: root = [1]
 * 输入：根 = [1]
 *
 * Output: [1]
 * 输出：[1]
 *
 *
 *
 * Constraints:
 * 限制条件：
 *
 * The number of the nodes in the tree is in the range [0, 100].
 * 树中的节点数量属于范围 [0, 100]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = postorderTraversal(root.left);
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversal bt = new BinaryTreePostorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> res = bt.postorderTraversal(root);
        System.out.println(res);
    }
}
