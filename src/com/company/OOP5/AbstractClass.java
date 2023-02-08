package com.company.OOP5;

abstract class AbstractClass {
    int a=10;

    abstract void fun(); // abstract method

    AbstractClass(){
        System.out.println("i am parent class constructor");
    }

    void fun2(){
        System.out.println("i am non - abstract method of Abstract class");
    }

    static void fun3(){
        System.out.println("i am static method of parent class");
    }
}
