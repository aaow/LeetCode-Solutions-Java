import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/26 22:21
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * 给定整数rowIndex，返回帕斯卡三角形的rowIndexth（0索引）行。
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
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * Example 2:
 * 示例2：
 * <p>
 * Input: rowIndex = 0
 * Output: [1]
 * Example 3:
 * 示例3：
 * <p>
 * Input: rowIndex = 1
 * Output: [1,1]
 * <p>
 * <p>
 * Constraints:
 * 限制条件：
 * <p>
 * 0 <= rowIndex <= 33
 * 0 <= rowIndex <= 33
 * <p>
 * <p>
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 * 后续：你能优化算法只用多出O(rowIndex)空间吗？
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        int[] buffer = new int[rowIndex + 1];
        buffer[0] = 1;
        computeRow(buffer, 1);
        // Copy buffer to List of Integer.
        List<Integer> ans = new ArrayList<>(buffer.length);
        for (int j : buffer) {
            ans.add(j);
        }
        return ans;
    }

    private void computeRow(int[] buffer, int k) {
        if (k >= buffer.length) {
            return;
        }
        int previous = buffer[0];
        for (int i = 1; i < k; i++) {
            int tmp = previous + buffer[i];
            previous = buffer[i];
            buffer[i] = tmp;
        }
        buffer[k] = 1;
        computeRow(buffer, k + 1);
    }


    public List<Integer> getRow2(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1) {
            {
                add(1);
            }
        };

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i-1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }

    public static void main(String[] args) {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        System.out.println(pascalsTriangleII.getRow(23));
        System.out.println(pascalsTriangleII.getRow2(23));
    }
}
