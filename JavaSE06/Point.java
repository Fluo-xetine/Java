package com.JavaSE06;

public class Point {
        int x;
        int y;
        //两种构造器定义方法
        public Point(){
    }
        public Point(int x,int y){
            this.x=x;
            this.y=y;
    }
    public void movePoint(int dx,int dy){
            x=x+dx;
            y=x+dy;
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2= new Point();
        p1.x=3;
        p1.y=3;
        p1.movePoint(1,2);
        p2.x=4;
        p2.y=4;
        p2.movePoint(5,7);

    }
}
