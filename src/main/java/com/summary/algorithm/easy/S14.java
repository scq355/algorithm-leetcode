package com.summary.algorithm.easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class S14 {

    public static void main(String[] args) {
        String[] strs = new String[] {"f","f","f"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        String base = strs[0];
        String commonSubStr = "";
        for (int j = 1; j <= base.length(); j++) {
            commonSubStr = base.substring(0, j);
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(commonSubStr)) {
                    commonSubStr = commonSubStr.substring(0, j - 1);
                    return commonSubStr;
                }
            }
        }
        return commonSubStr;
    }
}
