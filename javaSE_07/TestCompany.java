package com.javaSE_07;

public class TestCompany {
    public static void main(String[] args) {
     ColaEmployee[] ss={
       new SalariedEmployee("张三",5,5000),
       new HourlyEmployee("李四",5,180,10),
       new SalasEmployee("王二",7,100,100)
     };
     Company c=new Company();
     for (ColaEmployee cc:ss){
         c.show(cc,5);
     }
     }
}

