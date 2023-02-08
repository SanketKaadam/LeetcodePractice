package com.company.OOP3;

public class ChildClass extends ParentClass { /// here i inheritance parent class by using extend keyword
    int w;

    void greeting(){
        System.out.println("i am normal method of child class");
    }

    ChildClass(){
        System.out.println("i am constructor of child class");
    }

    public static void main(String[] args) {
       /* ParentClass obj = new ParentClass();
        obj.l=100;
        obj.b=200;
        obj.h=300;
        //obj.w=50; // here it given error we can't access child class variables and methods by using parent class object
        //obj.greeting();

        ChildClass obj2 = new ChildClass();
        obj2.l=100;
        obj2.b=200;
        obj2.h=300;
        obj2.w=50;
        obj2.fun(); // by using child class we access both class variables and methods
        obj2.greeting();
       // obj2.ParentClass(); */

        ParentClass obj3 = new ChildClass(); // here i am able to access only child class constructor and paresnt class constructor also able to access
        obj3.l=20;
        obj3.b=30;
        obj3.h=40;
        obj3.fun();
        //obj3.greeting();
       // obj3.w=50;// here by using parent class reference i am only able to access parent class methods and varibales

        // ChildClass obj4 = new ParentClass(); // this is not working





    }
}
