/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/27 17:10
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 * Example 2:
 * 示例2：
 * <p>
 * Input: nums = [1,5,4,5]
 * Output: 16
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
 * Example 3:
 * 示例3：
 * <p>
 * Input: nums = [3,7]
 * Output: 12
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * 2 <= nums.length <= 500
 * 2 <= nums.length <= 500
 * 1 <= nums[i] <= 10^3
 * 1 <= nums[i] <= 10^3
 */
public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("数组长度至少为2");
        }
        // 将数组按降序排序
        java.util.Arrays.sort(nums);
        // 获取最大的两个元素（从末尾取）
        int largest = nums[nums.length - 1];
        int secondLargest = nums[nums.length - 2];

        return (largest - 1) * (secondLargest - 1);
    }

    public int maxProduct2(int[] nums) {
        int max = 0;
        int secMax = 0;
        for(int i=0 ;i<nums.length ;i++){
            int digit = nums[i];
            if(digit > max){
                secMax = max;
                max = digit;
            }else if(digit>secMax){
                secMax = digit;
            }
        }
        return (max-1) * (secMax-1);
    }
    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray obj = new MaximumProductOfTwoElementsInAnArray();
        System.out.println(obj.maxProduct(new int[]{2, 3, 4, 5}));
        System.out.println(obj.maxProduct2(new int[]{2, 3, 4, 5}));
    }
}
