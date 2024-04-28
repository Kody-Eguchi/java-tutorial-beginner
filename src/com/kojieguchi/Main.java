package com.kojieguchi;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Primative Types
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);

//        Reference Types
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        Strings
        String message = "Hello \"World\"" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
    }
}