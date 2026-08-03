/**
 * @description: TODO
 * @author: chz
 * @date: 2026/8/3 16:53
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * 给定一个表示Excel表格中列标题的字符串columnTitle，返回其对应的列号。
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
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 * 示例2：
 *
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 * 示例3：
 *
 * Input: columnTitle = "ZY"
 * Output: 701
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= columnTitle.length <= 7
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle仅由大写英文字母组成。
 * columnTitle is in the range ["A", "FXSHRXW"].
 * columnTitle在["A", "FXSHRXW"]范围内。
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int res = 0;
        for (char c : s.toCharArray())
            res = res * 26 + (c - 'A' + 1);
        return res;
    }
    public int titleToNumber2(String columnTitle) {int cn=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            int value=c-'A'+1;
            cn=cn*26+value;
        }return (cn);
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("ABC"));
        System.out.println(excelSheetColumnNumber.titleToNumber2("ABC"));
    }
}
