package com.javaSE_07;

public class Circle extends Shape {
    int radius;
    public static final double PI=3.14;
    public Circle(){

    }

    @Override
    public void getArea() {
        area=radius*radius*PI;
    }

    @Override
    public void getPer() {
        per=PI*radius*2;
    }

    @Override
    public void showAll() {
      getArea();
      getPer();
        System.out.println("圆半径为"+radius+" 周长为"+per+" 面积为"+area);
    }

    public Circle(int radius,String color){
        this.radius=radius;
        this.color=color;
    }
}
