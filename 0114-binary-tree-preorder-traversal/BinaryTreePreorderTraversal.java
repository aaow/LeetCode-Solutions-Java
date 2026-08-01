import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/8/1 22:52
 *
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 给定二叉树的root，返回其节点值的预序遍历。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: root = [1,null,2,3]
 * Input：root = [1，null，2,3]
 *
 * Output: [1,2,3]
 * 输出：[1,2,3]
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
 * Output: [1,2,4,5,6,7,3,8,9]
 * 输出：[1,2,4,5,6,7,3,8,9]
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
 * The number of nodes in the tree is in the range [0, 100].
 * 树中的节点数在范围[0, 100]。
 * -100 <= Node.val <= 100
 * -100 <= Node.val <= 100
 *
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * 后续问题：递归解很简单，你能用迭代方式实现吗？
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    private void preorder(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            ans.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            if (root.left != null)
                stack.push(root.left);
        }

        return ans;
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal btp = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(btp.preorderTraversal(root));
        System.out.println(btp.preorderTraversal2(root));
    }
}
