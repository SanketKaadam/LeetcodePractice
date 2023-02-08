package com.company.OOP2;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        // all this 3 reference variable pointing to same object getInstance()

    }
}
