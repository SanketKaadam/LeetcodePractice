package com.company;

import java.util.Arrays;
//
public class LeetcodeRunningSumOf1dArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] arr){
        int[] ans = new int[arr.length];
        ans[0]= arr[0];
        for (int i=1; i< arr.length; i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
}
