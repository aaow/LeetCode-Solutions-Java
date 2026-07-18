/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/18 15:53
 *
 * Given a string s, return the longest palindromic substring in s.
 * 给定字符串s，返回最长的字串s。回文
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * 示例2：
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= s.length <= 1000
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 * s仅由数字和英文字母组成。
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        // 初始化：单个字符都是回文
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 处理长度为2的情况
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        // DP状态转移：长度为3及以上的回文
        for (int len = 3; len <= n; len++) {   // 子串长度
            for (int i = 0; i <= n - len; i++) {  // 起始位置
                int j = i + len - 1;              // 结束位置

                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }


    int n , start = 0, end = 0;
    public String longestPalindrome2(String s) {
        n = s.length();
        getString(s.toCharArray(), 0);
        return s.substring(start, end + 1);
    }
    public void getString(char[] arr, int i) {
        if (i >= n) return;
        int left = i, right = i;
        while (right + 1 < n && arr[i] == arr[right+1]) {
            right++;
        }
        i = right + 1;

        while (right + 1 < n && left - 1 >= 0 && arr[right+1] == arr[left-1]){
            right++;
            left--;
        }
        if (end - start < right - left) {
            start = left;
            end = right;
        }
        getString(arr, i);
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
        System.out.println(lp.longestPalindrome("cabacddd"));
        System.out.println(lp.longestPalindrome2("cabacddd"));
    }
}
