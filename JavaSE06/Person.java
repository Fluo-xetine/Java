package com.JavaSE06;

public  class Person {
    String name;
    double height;
    int weigth;
    public Person( String name,double height, int weigth){
        this.name=name;
        this.weigth=weigth;
        this.height=height;
    }
    public  static void  sayHello(String name){
        System.out.println("Hello,my name is "+name);
    }
}
