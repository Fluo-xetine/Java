package com.JavaSE06;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void  getArea(){
        int s =length*width;
        System.out.println("面积为"+s);

    }
    public  void getPer(){
        int c = (length+width)*2;
        System.out.println("周长为"+c);

    }
    public void showAll(){
        System.out.println("矩形长为"+length+"宽为"+width);
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,6);
        rectangle.showAll();
        rectangle.getArea();
        rectangle.getPer();

    }

}
