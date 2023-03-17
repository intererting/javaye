package com.yly.extend;

import org.checkerframework.checker.units.qual.K;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/3/1 下午4:00
 * @since 1.0
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(Father.b);
//        KotlinSon son = new KotlinSon();
//        son.setA(1);
//        System.out.println(son.getA());
//        System.out.println(new Son());

        String str2 = "SEUCalvin";//新加的一行代码，其余不变
        String str1 = new String("SEU") + new String("Calvin");
        System.out.println(str1.intern() == str1);
        System.out.println(str1 == "SEUCalvin");

    }
}