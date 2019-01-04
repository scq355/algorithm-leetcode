package com.summary.algorithm.easy;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class S3 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-13));
    }

    private static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        char[] charX = strX.toCharArray();
        String reverseX = "";
        for (int i = charX.length - 1; i >= 0 ; i--) {
            reverseX += charX[i];
        }
        return reverseX.equals(String.valueOf(x));
    }
}
