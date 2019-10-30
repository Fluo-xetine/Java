package com.javaSE_07;

public class Vehicle {
    private String brand;
    private String color;
    private double speed;
    public Vehicle(){}
    public Vehicle(String brand,String color){
        this.brand=brand;
        this.color=color;
        System.out.print(brand+" "+color+" "+speed);
    }
    public void setVehicle(String color,double speed){
        this.color=color;
        this.speed=speed;
    }
    public void run(){

        System.out.println();
        System.out.println("汽车奔跑的功能");
    }

//    public static void main(String[] args) {
//        Vehicle vehicle =new Vehicle("benz","black");
//        vehicle.run();
//    }
}




