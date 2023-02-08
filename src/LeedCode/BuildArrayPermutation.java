package LeedCode;

import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(arrays(nums)));
    }

    static int[] arrays(int[] nums){
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            arr[i]=nums[j];
        }
        return arr;
    }
}
