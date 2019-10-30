package com.JavaSE06;
public class PersonCreate {
    String name;
    double height;
    int age;
    public PersonCreate( String name, int age, double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public static void main(String[] args) {
        PersonCreate person1=new PersonCreate("zhangsan",33,1.73);
        PersonCreate person2=new PersonCreate("lisi",44,1.74);
        Person.sayHello(person1.name);
        Person.sayHello(person2.name);
    }
}
