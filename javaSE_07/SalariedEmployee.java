package com.javaSE_07;

public class SalariedEmployee extends ColaEmployee {
    int monthSalary;

    public SalariedEmployee(String name, int month,int monthSalary) {
        super(name, month);
        this.monthSalary=monthSalary;
    }
    @Override
    public double getSalary(int month) {
        if (birthday == month) {
            salary = monthSalary + 100;
        }
        else {
            salary=monthSalary;
        }
//      System.out.println(name+"的工资为"+salary);
        return salary;
    }
}
