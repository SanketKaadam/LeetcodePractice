package com.company.code;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] num1 = {4,5,6,0,0,0};
        int[] num2 = {1,2,3};
        merge(num1,3,num2,3);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1>=0 && nums1[p1]> nums2[p2]){
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }else{
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
