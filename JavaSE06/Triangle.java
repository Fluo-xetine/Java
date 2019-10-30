package com.JavaSE06;

public class Triangle {
   private int a;
   private int b;
   private int c;
   public void setTriangle(int a,int b,int c) {
       if ((a > 0 && b > 0 && c > 0) && ((a + b > c && a - b < c)&&(a + c > b && a - c < b) && (c + b > a && b - c < a))) {
           this.a = a;
           this.b = b;
           this.c = c;
           System.out.println("三角形边长为"+a+" "+b+" "+c);
       } else {
           System.out.println("输入的三角形边不合法！");
       }
   }
   public Triangle(){}

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setTriangle(3,5,16);
    }
}
