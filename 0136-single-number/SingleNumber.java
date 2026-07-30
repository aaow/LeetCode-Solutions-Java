/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/30 14:15
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * 给定一个非空 的整数数组 nums，除了一个元素外，每个元素都出现两次。找到那个元素。
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 你必须 实现一个线性运行复杂度的解决方案，并且只使用 常数 额外空间。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: nums = [2,2,1]
 * 输入：nums = [2,2,1]
 *
 * Output: 1
 * 输出：1
 *
 * Example 2:
 * 示例2：
 *
 * Input: nums = [4,1,2,1,2]
 * 输入：nums = [4,1,2,1,2]
 *
 * Output: 4
 * 输出：4
 *
 * Example 3:
 * 示例3：
 *
 * Input: nums = [1]
 * 输入：nums = [1]
 *
 * Output: 1
 * 输出：1
 *
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= nums.length <= 3 * 104
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 * 数组中的每个元素出现两次，只有一个元素只出现一次。
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{5,4,3,8,5,3,8}));
    }
}
