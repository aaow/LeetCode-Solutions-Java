import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/14 22:59
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 给定二叉树的root，返回其节点值的顺序遍历。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * Input: root = [1,null,2,3]
 * Input：root = [1，null，2,3]
 * <p>
 * Output: [1,3,2]
 * 输出：[1,3,2]
 * <p>
 * Explanation:
 * 解释：
 * <p>
 * <p>
 * <p>
 * Example 2:
 * 示例2：
 * <p>
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Input：root = [1,2,3,4,5，null，8，null，null，6,7,9]
 * <p>
 * Output: [4,2,6,5,7,1,3,9,8]
 * 输出：[4,2,6,5,7,1,3,9,8]
 * <p>
 * Explanation:
 * 解释：
 * <p>
 * <p>
 * <p>
 * Example 3:
 * 示例3：
 * <p>
 * Input: root = []
 * 输入：根 = []
 * <p>
 * Output: []
 * 输出：[]
 * <p>
 * Example 4:
 * 示例4：
 * <p>
 * Input: root = [1]
 * 输入：根 = [1]
 * <p>
 * Output: [1]
 * 输出：[1]
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * 树中的节点数在范围[0, 100]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {
    private List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        ans.add(root.val);
        dfs(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        BinaryTreeInorderTraversal bt = new BinaryTreeInorderTraversal();
        List<Integer> result = bt.inorderTraversal(root);
        System.out.println(result);
    }
}
