package com.javaSE_07;

public abstract class Shape {
    double area;
    double per;
    String color;
    public Shape(){

    }
    public Shape( String color){
        this.color=color;
    }
    public abstract void getArea();
    public abstract void getPer();
    public abstract void showAll();
    public static void  showColor(String color){
        System.out.println(color);
    }
}
