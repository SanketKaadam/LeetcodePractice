package com.company.OOP5;

public class InterfaceChild implements Interfaces,Interfaces2 {
    @Override
    public void fun() {
        System.out.println("i am override method of 2 parent class");
    }

    @Override
    public void fun2() {
        System.out.println("i am abstract method of Interface 2 ");
    }

    public static void main(String[] args) {
        InterfaceChild obj = new InterfaceChild();
        obj.fun();
        obj.fun2();

    }
}
