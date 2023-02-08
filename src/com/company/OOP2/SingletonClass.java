package com.company.OOP2;

public class SingletonClass {
    private  SingletonClass(){ // we don't want to create multiple object that's why constructor is private

    }

    private static SingletonClass instance;  // here instance is instance variable of class Singleton class, we use in static method that's why it static

    public static SingletonClass getInstance(){  // we access this method in Main that's why it is public
        if(instance==null){
            instance= new SingletonClass();  // here we use static variable
        }
        return instance;
    }

}
