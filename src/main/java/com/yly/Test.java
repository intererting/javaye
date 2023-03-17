package com.yly;

import java.awt.geom.RoundRectangle2D;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {

    String s = "a" + "b";

    public static void main(String[] args) {
//        Float a = Float.valueOf(1.0f - 0.9f);
//        Float b = Float.valueOf(1.0f - 0.9f);
//        System.out.println(a.equals(b));
//        MathContext mathContext = new MathContext(6);
//        BigDecimal a = new BigDecimal(0.9f - 0.8f, mathContext);
//        BigDecimal b = new BigDecimal(1.0f - 0.9f, mathContext);
//        System.out.println(a.compareTo(b));
//        System.out.println(a.equals(b));

//        float tolenrace = 1e-6f;
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(Math.abs(a - b) < tolenrace);
//        LocalDateTime dateTime = LocalDateTime.now();

        ArrayList<Fruit> test = new ArrayList<>();
        test.add(new Apple());
        test.add(new Pair());
//        List<? extends Fruit> datas = test;
//        System.out.println(datas.size());

        List<? super Fruit> datas = new ArrayList<>();
        datas.add(new Apple());
        Fruit fruit = (Fruit) datas.get(0);
        System.out.println(fruit);
    }
}

//enum SeasonEnum {
//    SPRING, SUMMER;
//
//    void test() {
//        System.out.println("hellp");
//    }
//}

class Base {

}

class Fruit {

}

class Apple extends Fruit {

}

class Pair extends Fruit {

}