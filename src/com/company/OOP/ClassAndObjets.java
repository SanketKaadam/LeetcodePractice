package com.company.OOP;

public class ClassAndObjets {
    double c;
    void method(){
        System.out.println("I am method ");
    }
    ClassAndObjets(){
        System.out.println("I am constructor method");
    }

    double returnMethod(int a, int b){
        c = a+b;
        System.out.println(c);
        return c;
    }

    static void staticMethod(){
        System.out.println("I am static method ");
    }

    void add(){
        System.out.println("I am doing method overloading and i do not have any parameters");
    }

    void add(int a){
        System.out.println("i have one parameter "+ a);
    }

    void add(int a, int b){
        System.out.println("i have two parameter "+ a+" and "+b);
    }

    double add(int a, double b, int d){
        System.out.println("in this method we take two parameter same as above but return type is different");
        c= a+b+d;
        return c;
    }

     int add(int ...arr){
        int result =0;
        for(int a : arr){
            result = result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        ClassAndObjets obj = new ClassAndObjets();
/*
        // calling simple method having no return type
        obj.method();

        //calling method having return type
        int ans = obj.returnMethod(10,20);

        // if method have return type then we need to print output
        System.out.println(obj.returnMethod(30,40));
        System.out.println(ans);

        staticMethod(); // here we directly call without help of object because of static

        // method overloading
        obj.add();
        obj.add(10);
        obj.add(10,20);*/
        System.out.println(obj.add(10,20.0,30));
        System.out.println(obj.add(10,20,30,40));

    }
}
