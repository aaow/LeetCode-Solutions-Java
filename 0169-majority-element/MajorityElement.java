import java.util.Arrays;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/8/6 14:43
 * Given an array nums of size n, return the majority element.
 * 给定大小为 n 的数组 nums，返回多数元素。
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 多数元素是出现超过 ⌊n / 2⌋ 次的元素。 您可以假设多数元素始终存在于数组中。
 *
 *
 *
 * Example 1:
 * 示例 1：
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * 示例 2：
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 *
 * Constraints:
 * 限制：
 *
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * The input is generated such that a majority element will exist in the array.
 * 生成输入使得多数元素将存在于数组中。
 *
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums [n/2];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}
