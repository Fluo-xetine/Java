package com.javaSE_07;

public class Company {
    public void show(ColaEmployee emplory,int month){
        double salary=emplory.getSalary(month);
        System.out.println(emplory.name+" "+month+"月份的工资为 "+salary);
    }
}
