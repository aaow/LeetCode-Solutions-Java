/**
 * @description: TODO
 * @author: chz
 * @date: 2026/8/4 22:45
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 *
 * For example:
 * 例如：
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: columnNumber = 1
 * Output: "A"
 * Example 2:
 * 示例2：
 *
 * Input: columnNumber = 28
 * Output: "AB"
 * Example 3:
 * 示例3：
 *
 * Input: columnNumber = 701
 * Output: "ZY"
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= columnNumber <= 231 - 1
 * 1 <= columnNumber <= 231 - 1
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char)('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(26));
    }
}
