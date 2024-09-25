package org.example;

public class Dev {

    private final Computer com;


    public Dev(Computer com){
        this.com=com;
    }
//    public Computer getCom() {
//        return com;
//    }
//
//    public void setCom(Computer com) {
//        this.com = com;
//    }

    public void build(){
        com.compile();
        System.out.println("Hello building this stuff!!");
    }
}
