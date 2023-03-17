package com.yly.jdk8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/10/26 下午5:10
 * @since 1.0
 */
public class PatternTest {
    public static void main(String[] args) {


//        Pattern pattern = Pattern.compile("(?<=j)ava");
//        Matcher matcher = pattern.matcher("java");
//
//        while (matcher.find()) {
//            System.out.println(matcher.groupCount());
//            System.out.println(matcher.group(0));
//        }
//        while (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }

        Pattern pattern = Pattern.compile("(?is)a.*b");
        Matcher matcher = pattern.matcher("123adddd\r\ndasdas\r\n11b3333");

        while (matcher.find()) {
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(0));
        }
    }
}
