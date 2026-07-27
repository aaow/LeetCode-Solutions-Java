/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/27 16:50
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 你会得到一个阵列prices，其中prices[i]是某只股票在ith日的价格。
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 你希望通过选择某一天买入一只股票，然后选择未来另一天卖出该股票来最大化利润。
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 返还你能从这笔交易中获得的最大利润。如果无法获得任何利润，就退还0。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * 示例2：
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= prices.length <= 105
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 * 0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
    public int maxProfit2(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for(int p : prices){
            if(p < buy){
                buy = p;
            }
            else{
                profit = Math.max(p - buy, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();
        System.out.println(s.maxProfit(new int[] {1,13,4,5,2,3,4,5}));
        System.out.println(s.maxProfit2(new int[] {11,3,4,5,2,3,4,5}));
    }
}
