package com.company;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={2,1,3,5,4,7,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0; i< arr.length;i++){
            swapped = false;
            for(int j=1; j< arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped= true;
                }
            }
            if(swapped==false){
                break;
           }
        }
    }
}
