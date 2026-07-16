import java.util.HashSet;
import java.util.Set;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/16 14:06
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 * 给定字符串s，求出最长且无重复字符的长度。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * Example 2:
 * 示例2：
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * 示例3：
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 0 <= s.length <= 5 * 104
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 * s由英文字母、数字、符号和空格组成。
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while (right < s.length()) {
            // 如果当前字符未在窗口中，扩展右边界
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                // 遇到重复字符，收缩左边界直到无重复
                while (left < right && seen.contains(s.charAt(right))) {
                    seen.remove(s.charAt(left));
                    left++;
                }
            }
        }

        return maxLen;
    }
    public int lengthOfLongestSubstring2(String s) {
        int [] charMap = new int[128];
        int maxLen = 0;
        int left =0,right=0,n = s.length();
        while (right < n){
            char currentCar = s.charAt(right);
            left = Math.max(left,charMap[currentCar]);
            maxLen = Math.max(maxLen,right - left + 1);
            charMap[currentCar] = right + 1;
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring2("abcabcbb"));
    }
}
