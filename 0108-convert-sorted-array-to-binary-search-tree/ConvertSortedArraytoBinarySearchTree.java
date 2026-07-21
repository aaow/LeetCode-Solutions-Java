/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/21 16:38
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * 给定一个整数组nums，元素按升序排序，将其转换为二叉搜索树。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 *
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 *
 * Example 2:
 * 示例2：
 *
 *
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= nums.length <= 104
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in a strictly increasing order.
 * nums排序顺序严格递增。
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums, left, mid - 1);
        node.right = build(nums, mid + 1, right);

        return node;
    }

}
