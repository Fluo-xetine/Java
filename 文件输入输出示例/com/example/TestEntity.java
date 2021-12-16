package com.example;

public class TestEntity {
    private String name;
    private String no;
    private int age;

    public TestEntity(String name, String no, int age) {
        this.name = name;
        this.no = no;
        this.age = age;
    }

    public TestEntity() {
    }

    @Override
    public String toString() {
        String string = name+" "+no+" "+age+"\r\n";
        return string;
    }
}
