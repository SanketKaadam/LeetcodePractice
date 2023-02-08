package com.company.OOP3;

public class ParentClass {
   public int l;
    int b;
    int h;
    private String name;
    private float marks;

    void fun(){
        System.out.println("I am normal method of parent class");
    }

    ParentClass(){
        System.out.println("I am constructor of parent class");
    }

    private void sum(){
        System.out.println("i am private parent class method");
    }
}
