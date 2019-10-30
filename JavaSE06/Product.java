package com.JavaSE06;

public class Product {
    String name;
    int price;
    public void output(){
        System.out.println(name+":"+price);
    }
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name="可乐";
        product1.price=3;
        product1.output();
        Product product2 = new Product();
        product2.name="鼠标";
        product2.price=50;
        product2.output();
    }
}
