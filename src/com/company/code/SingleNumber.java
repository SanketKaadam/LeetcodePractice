package com.company.code;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,5};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++)
        {
            result ^=nums[i];
        }
        return result;
    }
}
