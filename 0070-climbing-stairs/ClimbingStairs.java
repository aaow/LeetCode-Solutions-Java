/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/12 13:18
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 * 你正在爬楼梯。要走n步才能到达顶端。
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 每次你可以选择攀爬1级或2级台阶。你能用多少种不同的方式攀登顶峰？
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * 示例2：
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= n <= 45
 * 1 <= n <= 45
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        // 只需要两个变量记录前两个状态
        int prev2 = 1;  // f(n-2)
        int prev1 = 2;  // f(n-1)
        int current;    // f(n)

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(3));
        System.out.println(climbingStairs.climbStairs(45));
    }
}
