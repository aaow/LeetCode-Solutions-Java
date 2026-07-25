import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/25 16:51
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 给定整数numRows，返回帕斯卡三角形的前数行。
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 在帕斯卡三角形中，每个数字是其正上方两个数字的和，如图所示：
 * <p>
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 示例1：
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * 示例2：
 * <p>
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * 1 <= numRows <= 30
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }

            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;
        PascalsTriangle triangle = new PascalsTriangle();
        System.out.println(triangle.generate(numRows));
    }
}
