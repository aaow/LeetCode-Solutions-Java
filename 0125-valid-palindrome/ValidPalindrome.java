/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/29 23:16
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 如果一个短语在将所有大写字母转换为小写字母并去除所有非字母数字字符后，正反读法相同，则称为回文。字母数字字符包括字母和数字。
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 给定字符串s，如果是回文则返回true，否则false。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 示例2：
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 示例3：
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= s.length <= 2 * 105
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 * s仅包含可打印的ASCII字符。
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome("a1b1a"));
    }
}
