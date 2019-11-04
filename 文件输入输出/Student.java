package javaSE_12;

public class Student {
    private String name;
    private String sno;
    private int age;

    public Student(String name, String sno, int age) {
        this.name = name;
        this.sno = sno;
        this.age = age;
    }


    @Override
    public String toString() {
        String string = name+" "+sno+" "+age+"\r\n";
        return string;
    }
}
