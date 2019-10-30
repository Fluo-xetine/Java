package com.javaSE_07;

public class Players {
    private static int sum=1;
    public Players(){

    }
    public static Players getPlayers() {
        if (sum <= 11) {

            System.out.println("创建一个对象"+sum);
            sum++;
            return new Players();
        } else {
            System.out.println("已经创建了11个对象不能再创建了！");
            return null;
        }
    }

}
