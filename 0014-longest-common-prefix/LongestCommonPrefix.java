/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/2 15:48
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String temp = strs[0];
        int i = 1;
        String cur;
        while (!temp.isEmpty() && i < strs.length) {
            if (temp.length() > strs[i].length()) {
                temp = temp.substring(0, strs[i].length());
            }
            cur = strs[i].substring(0, temp.length());
            if (!cur.equals(temp)) {
                temp = temp.substring(0, temp.length() - 1);
            } else {
                i++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        System.out.println(lc.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(lc.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
