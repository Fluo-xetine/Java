package com.javaSE_07;

public class SalasEmployee extends ColaEmployee {
    int monthsale;
    int ticheng;

    public SalasEmployee(String name, int month,int monthsale,int ticheng) {
        super(name, month);
        this.monthsale=monthsale;
        this.ticheng=ticheng;
    }

    @Override
    public double getSalary(int month) {
        salary= monthsale * ticheng;
        if (birthday == month) {
            salary = salary + 100;
        }
//      System.out.println(name+"的工资为"+salary);
        return salary;
    }
}
