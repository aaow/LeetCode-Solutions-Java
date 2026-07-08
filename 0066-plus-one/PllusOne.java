import java.util.Arrays;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/8 15:41
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * 你会得到一个大整数，表示为整数组digits，每个digits[i]是整数的ith位。数字按从左到右从最重要到最不重要排列。大整数不含任何前导0。
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * 将大整数增一，返回所得数字数组。
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * 示例2：
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * 示例3：
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * 1 <= digits.length <= 100
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class PllusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0; // 进位，当前位归零
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;

    }

    public static void main(String[] args) {
        PllusOne pllusOne = new PllusOne();
        System.out.println(Arrays.toString(pllusOne.plusOne(new int[] {1, 2, 4, 5, 6})));
        System.out.println(Arrays.toString(pllusOne.plusOne(new int[] {4,3,2,1})));
        System.out.println(Arrays.toString(pllusOne.plusOne(new int[] {9})));
        System.out.println(Arrays.toString(pllusOne.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
    }
}
