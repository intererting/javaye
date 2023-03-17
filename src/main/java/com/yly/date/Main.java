package com.yly.date;

import org.yaml.snakeyaml.nodes.ScalarNode;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2022/6/20 下午5:49
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        System.out.println(format.format(calendar.getTime()));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK) - calendar.getFirstDayOfWeek());
    }
}
