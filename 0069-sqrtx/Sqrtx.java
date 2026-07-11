/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/11 13:48
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * 给定一个非负整数x，返回x的平方根，向下取整至最近的整数。返回的整数也应为非负数。
 *
 * You must not use any built-in exponent function or operator.
 * 你不能使用任何内置的指数函数或算子。
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 例如，不要在C++中使用pow(x, 0.5)，在Python中x ** 0.5。
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 * 示例2：
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 0 <= x <= 231 - 1
 * 0 <= x <= 231 - 1
 */
public class Sqrtx {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) { ans = mid; l = mid + 1; }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(8));
        System.out.println(sqrtx.mySqrt(11));
    }
}
