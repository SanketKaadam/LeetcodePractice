package com.company.OOP5;

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.a=100; // here i initialize parent variable by using child class object

        obj.fun();
        obj.fun2();  // here i called non abstract method of parent class by using child class object
        obj.fun3();   // it allowed but not good practice
        ChildClass.fun3(); // here i am able to access parent static method by using child class name
        //AbstractClass obj2 = new AbstractClass(); // here i am unable to create object of abstractness
        AbstractClass obj2 = new ChildClass();  // here i create reference of  abstract class

        obj2.fun();
        obj2.fun2();  // here i called non abstract method of parent class by using child class object
        obj2.fun3();  // it allowed but not good practice
        AbstractClass.fun3(); //  here i am able to access parent static method by using parent class name


    }
}
