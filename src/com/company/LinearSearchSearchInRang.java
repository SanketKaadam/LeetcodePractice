package com.company;

public class LinearSearchSearchInRang {
    public static void main(String[] args){
        int[] arr = {18, 12, -7, 3, 14, 28,11,20,30,40,50,60,7,0,80};
        int target = 20;
        int start = 3;
        int end = 9;
        System.out.println(searchInRange(arr, target,start,end));
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        for (int i=start; i<= end; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
