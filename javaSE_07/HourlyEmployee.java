package com.javaSE_07;

public class HourlyEmployee extends ColaEmployee{
    int hours;
    double hoursSalary;

    public HourlyEmployee(String name, int month,int hours, double hoursSalary) {
        super(name, month);
        this.hours=hours;
        this.hoursSalary=hoursSalary;
    }

    @Override
    public double getSalary(int month) {
     if(hours>160){
        salary=1.5*hoursSalary*(hours-160)+hoursSalary*160;
     }
     else {
         salary=hoursSalary*hours;
     }
        if (birthday == month) {
            salary = salary + 100;
        }
//       System.out.println(name+"的工资为"+salary);
        return salary;
    }
}
