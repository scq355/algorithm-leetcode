package com.summary.algorithm.simlpe;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class S118 {

    public static void main(String[] args) {
        generate(5);
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int k = 0; k < i + 1; k++) {
                rowList.add(0);
            }
            rowList.set(i, 1);
            rowList.set(0, 1);
            for (int j = 0; j < i; j++) {
                if (rowList.get(j) != 1) {
                    rowList.set(j, resultList.get(i - 1).get(j - 1) + resultList.get(i - 1).get(j));
                }
            }
            resultList.add(rowList);
        }
        return resultList;
    }
}
