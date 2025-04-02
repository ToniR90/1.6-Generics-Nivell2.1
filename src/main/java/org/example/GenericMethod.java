package org.example;

public class GenericMethod <T>{

    public void printGenericArgs(Person argument1 , T argument2 , T argument3){
        System.out.println("First argument: " + argument1);
        System.out.println("Second argument: " + argument2);
        System.out.println("Third argument: " + argument3);
    }

}
