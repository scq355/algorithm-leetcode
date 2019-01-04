package com.summary.algorithm.easy;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class S125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().trim().toCharArray();
        char[] resultChars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '0' && chars[i] <= '9') || (chars[i] >= 'a' && chars[i] <= 'z')) {
                resultChars[i] = chars[i];
            } else {
                resultChars[i] = '*';
            }
        }
        String res = String.valueOf(resultChars);
        res = res.replace("*", "");
        chars = res.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] != chars[chars.length - j - 1]) {
                return false;
            }
        }
        return true;
    }
}
