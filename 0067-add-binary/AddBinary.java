import java.math.BigInteger;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/10 15:07
 * Given two binary strings a and b, return their sum as a binary string.
 * 给定两个二进制字符串 a 和 b，返回它们的和作为二进制字符串。
 *
 *
 *
 * Example 1:
 * 示例1：
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * 示例2：
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 * 限制条件：
 *
 * 1 <= a.length, b.length <= 104
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * a和b仅由'0'或'1'个角色组成 。
 * Each string does not contain leading zeros except for the zero itself.
 * 每个字符串都不包含前置零点，除了零点本身。
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        // 将二进制字符串转为十进制 BigInteger
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        // 求和并转回二进制字符串
        return bigA.add(bigB).toString(2);
    }

    public String addBinary2(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if(lenA < lenB) return addBinary2(b , a);

        char[] result = new char[lenA + 1];
        int carry = 0;
        int k = lenA;

        for(int i = lenA - 1, j = lenB - 1; i >= 0; i--){
            carry += a.charAt(i) - '0';
            if(j >= 0){
                carry += b.charAt(j--) - '0';
            }
            result[k--] = (char)('0' + (carry & 1));
            carry >>= 1;
        }

        if(carry == 1){
            result[k] = '1';
            return new String(result);
        }

        return new String(result,1,lenA);




    }
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11", "1"));
        System.out.println(addBinary.addBinary("1010", "1011"));
        System.out.println(addBinary.addBinary2("1010", "1011"));
    }
}
