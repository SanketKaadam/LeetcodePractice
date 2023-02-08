package com.company.code;

public class letvode {
        public static void main(String[] args) {
            int[] nums = {3,2,2,3};
            int val = 3;
            System.out.println(removeElement(nums,val));
        }

        public static int removeElement(int[] nums, int val) {
            int count=1;
            for (int i=0; i< nums.length; i++){
                if (val==nums[i]){
                    nums[i]=nums[i+1];
                    count++;
                }
            }
            return count;
        }
}


