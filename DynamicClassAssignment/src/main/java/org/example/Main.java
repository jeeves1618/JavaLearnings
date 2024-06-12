package org.example;

import org.example.Domain.Phone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Hello world!");
        Class<?> theClass = Class.forName("org.example.Domain.Phone");
        System.out.println(theClass.toString());
        System.out.println(theClass.getSimpleName());
        Constructor<?> constructor = theClass.getConstructor();
        Class[] constructorArgs = new Class[3]; //Phone's constructor has 3 arguments
        constructorArgs[0] = String.class;  //First argument is of *object* type String
        constructorArgs[1] = String.class; //Second argument is of *object* type String
        constructorArgs[2] = int.class; //Third argument is of *primitive* type int
        Object iphone = theClass.getDeclaredConstructor(constructorArgs).newInstance("iPhone 15", "Apple", 256);
        Phone newPhone = (Phone)constructor.newInstance();
        System.out.println(iphone);
        System.out.println(newPhone);
    }
}