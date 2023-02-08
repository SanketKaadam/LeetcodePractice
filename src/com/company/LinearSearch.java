package com.company;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        System.out.println(linearsearch(arr, target));
    }

    static int linearsearch(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }
        /* for (int i=0; i< arr.length; i++){
            if(arr[i]==target){
                return i;   // here we return index
            }
        } */

        for (int element : arr){
            if (element==target){
                return element;   // here we return element
            }
        }
        return -1;
    }
}
