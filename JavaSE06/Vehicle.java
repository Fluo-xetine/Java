package com.JavaSE06;

public class Vehicle {
   private String brand;
   private String color;
   private double speed;
   public Vehicle(String brand,String color){
       this.brand=brand;
       this.color=color;
       System.out.println(brand+" "+color+" "+speed);
   }
   public void setVehicle(String color,double speed){
       this.color=color;
       this.speed=speed;
   }
   public void run(){
       System.out.println("汽车奔跑的功能");
   }

}
