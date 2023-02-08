package com.company;
import java.util.*;



public class Array1 {
    public static void main(String[] args){

        int[] arr =  {10,20,30,40,50,60,70,80,90};
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[5];

            arr1[0]=10;
            arr1[1]=20;
            arr1[2]=30;
            arr1[3]=40;
            arr1[4]=50;
            System.out.println(Arrays.toString(arr1));

            int[] arr2;
            arr2=new int[10];
            Scanner in = new Scanner(System.in);
            for (int i=0; i< arr2.length; i++){
                arr2[i]= in.nextInt();
            }
        System.out.println(Arrays.toString(arr2));

    }
}

