package com.summary.algorithm.easy;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class S136 {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int record;
        for (int i = 0; i < nums.length; i++) {
            record = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    record = 2;
                    break;
                }
            }
            if (record == 0) {
                return nums[i];
            }
        }
        return 0;
    }
}
