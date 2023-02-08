package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractices {
    public static void main(String[] args){
       /* ArrayList<Integer>  list = new ArrayList<>(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.contains(40)); */

        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            list2.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list2.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list2);

    }
}
