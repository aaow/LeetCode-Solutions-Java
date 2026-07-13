import java.util.Arrays;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/13 14:58
 * merge-sorted-array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * 你会得到两个整数组 nums1 和 nums2，按非递减顺序排列，以及两个整数 m 和 n，分别表示 nums1 和 nums2 中的元素数。
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 合并nums1并nums2成一个按非降序排序的单一数组。
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 最终排序后的数组不应由函数返回，而是存储在数组nums1中。为此，nums1 的长度为 m + n，其中前m元素表示应合并的元素，最后n元素设为0，应忽略。nums2长度为n。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * 示例2：
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 * 示例3：
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * nums1.length == m + n
 * nums1.length == m + n
 * nums2.length == n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * -109 <= nums1[i], nums2[j] <= 109
 *
 *
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 * 后续： 你能想出一个能在O(m + n)时间内运行的算法吗？
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;

            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 6,0,0,0};
        int[] nums2 = {6, 4, 8};
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
