package com.summary.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class S1 {

    public static void main(String[] args) {
        int[] num1 = new int[] {2, 4, 0};
        int[] ints = twoSum(num1, 3);
        System.out.println(ints);
    }

    private static int[] twoSum(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        int[] result = new int[2];
        for(int i = 0; i < numList.size(); i++) {
            int temp = target - numList.get(i);
            if(numList.contains(temp)) {
                result[0] = i;
                result[1] = numList.indexOf(temp);
            }
            break;
        }
        return result;
    }
}
