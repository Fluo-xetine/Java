package com.javaSE_07;

class Car extends Vehicle {
    int loader;
    public Car(){
        super("Honda","red");
    }
    public Car(int loader){
        this.loader=loader;
        System.out.println(" 载人数为"+loader);
    }
    @Override
    public void run(){
        System.out.println("汽车奔跑功能");
    }
}
