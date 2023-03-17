package com.yly.datetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2022/5/5 下午3:19
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("GMT+8"));
//        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("UTC+04:00")));
//        System.out.println(zonedDateTime);
//        System.out.println(LocalDateTime.now(ZoneId.of("UTC+05:00")));
//        System.out.println(LocalDateTime.now(Clock.system(ZoneId.of("UTC+04:00"))));
//        Clock clock = Clock.systemUTC();
//        System.out.println(LocalDateTime.ofInstant(localDateTime.toInstant(ZoneOffset.of("+08:00")), ZoneId.of("UTC+06:00")));
        Person<String> person = new Person<>();
        person.test("a", 1);
    }
}

class Person<T> {
    <M> M test(T a, M b) {
        return b;
    }
}













