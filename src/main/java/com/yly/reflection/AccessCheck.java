package com.yly.reflection;

import javax.swing.text.NumberFormatter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * author        yiliyang
 * date          2022-07-21
 * time          上午10:45
 * version       1.0
 * since         1.0
 */
public class AccessCheck {

    public static void main(String[] args) {
//        try {
//            Reflect reflect = new Reflect("yuliyang");
//            Field field = Reflect.class.getDeclaredField("name");
////            field.setAccessible(true);
//            System.out.println(field.get(reflect));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        DecimalFormat decimalFormat = new DecimalFormat("####.#");
//        System.out.println(decimalFormat.format(-123124.234));

        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break outer;
                }
                System.out.println("j " + j);
            }
            System.out.println("i " + i);
        }

    }
}

class Reflect {
    private String name;

    public Reflect(String name) {
        this.name = name;
    }
}
