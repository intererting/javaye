package com.yly.jdk8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/6/22 上午10:15
 * @since 1.0
 */
public class StreamTest {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream<Integer> another = Stream.of(4, 5, 6);
        Stream<Integer> third = Stream.of(7, 8, 9);
        Stream<Integer> more = Stream.of(0);
        List result = Stream.of(stream, another, third, more).flatMap(integerStream -> integerStream.map(integer -> integer * 10)).
                collect(Collectors.toList());
        System.out.println(result);
    }
}
