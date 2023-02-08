package com.company.code;

public class ltcode {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int l = nums.length - 1;
        for(int i=0; i<=l; i++){
            if(nums[i] == val){
                nums[i] = nums[l];
                i--;
                l--;;
            }
        }
        return l+1;
    }
}
