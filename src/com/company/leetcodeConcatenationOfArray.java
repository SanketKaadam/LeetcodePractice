package com.company;
import java.util.Arrays;
// https://leetcode.com/problems/concatenation-of-array
public class leetcodeConcatenationOfArray {
        public static void main(String[] args){
            int[] arr = {1,2,1};

            System.out.println(Arrays.toString(getConcatenation(arr)));
        }

        static int[] getConcatenation(int[] nums) {
            int n= nums.length;
            int[] ans = new int[2*nums.length];
            for (int i=0; i< nums.length; i++){
                ans[i]=nums[i];
                ans[i+n] = nums[i];
                }
            return ans;
            }
}



