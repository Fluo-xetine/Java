package com.javaSE_07;

public abstract class ColaEmployee {
    String name;
    int birthday;
    double salary;

    public ColaEmployee(String name,int birthday){
        this.birthday=birthday;
        this.name=name;
    }
    public abstract double getSalary(int month);

}
