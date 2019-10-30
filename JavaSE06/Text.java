package com.JavaSE06;

public class Text {
    char color;
    int cpu;
    public Text(){

    }
    public Text(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public void showText(){
        System.out.println("笔记本颜色为"+color+","+"cpu型号为"+cpu);
    }
}
