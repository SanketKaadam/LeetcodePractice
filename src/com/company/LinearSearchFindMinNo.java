package com.company;

public class LinearSearchFindMinNo {
    public static void main(String[] args){
        int[] arr = {18, 12, 7, 413, 14, 28};
        System.out.println(minNoInArray(arr));
    }

    static int minNoInArray(int[] arr){
        int min= arr[0];
        for (int j : arr)
            if (j < min) {
                min = j;
            }
        return min;
    }
}
