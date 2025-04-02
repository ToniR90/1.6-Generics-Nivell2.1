package org.example;

public class Main {
    public static void main(String[] args) {
        Person arg1 = new Person("Toni" , "Romero" , 35);
        String arg2 = "This is a String";
        int arg3 = 2025;

        GenericMethod object1 = new GenericMethod();
        object1.printGenericArgs(arg1 , arg2 , arg3);
    }
}