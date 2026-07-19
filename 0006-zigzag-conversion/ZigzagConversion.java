/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/19 15:01
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * 字符串"PAYPALISHIRING"以锯齿形排列在指定行数上，如下所示：（你可能想用固定字体显示此图案以提高可读性）
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * 然后一行一行地读："PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * 编写代码，将字符串对若干行进行转换：
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * 示例2：
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 * 示例3：
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= s.length <= 1000
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * s由英文字母（小写和大写）、','和'.'组成。
 * 1 <= numRows <= 1000
 * 1 <= numRows <= 1000
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        int n = s.length();
        int cycle = 2 * (numRows - 1);
        char[] result = new char[n];
        int idx = 0;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycle) {
                result[idx++] = s.charAt(j);
                int diag = j + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 && diag < n) {
                    result[idx++] = s.charAt(diag);
                }
            }
        }
        return new String(result);
    }
}
