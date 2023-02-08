package com.company.OOP2;

public class InnerOuterClass {
     static class Inner{
         int a=10;
         String b="sanket";

         void fun(){
             System.out.println("i am in static class method");
         }
    }

    int c= 20;
     float d=20.32f;
     void fun2(){
         System.out.println("i am normal method");
     }


    public static void main(String[] args) {
        Inner obj = new Inner(); // without object we can't access static class non-static variables and non-static methods
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.fun();
        // obj.c  // we can't access outer class variables and methods  by using inner class object
        // obj.fun2();

        InnerOuterClass obj2 = new InnerOuterClass();
        System.out.println(obj2.c);
        //System.out.println(obj2.a);
        // obj2.fun();  // we can't  access varibales and methods of static Inner class
        obj2.fun2();
    }
}
