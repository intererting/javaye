package com.yly.jdk8;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/5/8 下午4:23
 * @since 1.0
 */
public class FunctionQuote {

    public static void main(String[] args) {
        TestInterface testInterface = Integer::parseInt;
        testInterface.test("haha");
    }

//    static void test(Function<String, Integer> function, String value) {
//        System.out.println(function.apply(value));
//    }
}

@FunctionalInterface
interface TestInterface {
    int test(String value);
}
