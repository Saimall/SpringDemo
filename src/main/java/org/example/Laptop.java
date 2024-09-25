package org.example;

public class Laptop implements  Computer{

    public Laptop(){
        System.out.println("Inside laptop constructor");
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
