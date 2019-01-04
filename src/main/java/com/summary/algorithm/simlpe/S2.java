package com.summary.algorithm.simlpe;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class S2 {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    private static int reverse(int x) {
        String strX = String.valueOf(x);
        char[] charX = strX.toCharArray();
        String reverseX = "";
        boolean flag = true;
        for (int i = charX.length - 1; i >= 0 ; i--) {
            if (charX[i] == '-') {
                flag = false;
            } else {
                reverseX += charX[i];
            }
        }
        reverseX = flag ? reverseX : ("-" + reverseX);
        if (Double.valueOf(reverseX) < Integer.MIN_VALUE || Double.valueOf(reverseX) > Integer.MAX_VALUE) {
            return 0;
        }
        return Integer.valueOf(reverseX);
    }
}
