package com.javaSE_07;

public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int width,int height,String color){
        this.height=height;
        this.width=width;
        this.color=color;
    }
    @Override
    public void getArea() {
        area=width*height;
    }

    @Override
    public void getPer() {
        per=(width+height)*2;
    }

    @Override
    public void showAll() {
        getArea();
        getPer();
//        area=width*height;
//        per=(width+height)*2;
        System.out.println("矩形宽度为"+width+" 长度为"+height+" 周长为"+per+" 面积为"+area);
    }
}
