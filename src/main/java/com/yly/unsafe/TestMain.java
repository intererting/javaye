package com.yly.unsafe;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/10/13 下午2:33
 * @since 1.0
 */
final class A {

    String selfIntroduction() {
        return "I'm A " + getClass().getName();
    }

    String testField = "I'm A field";
}

class B {

    String selfIntroduction() {
        return "I'm B " + getClass().getName();
    }

    String testField2 = "I'm B field22222222222";
    String testField  = "I'm B field";

}

class Test {
    public final A a = new A();
}

public class TestMain {

    public static void main(String[] args) {
        Test test = new Test();
        B b = new B();

        System.out.println("替换前");
        System.out.println(test.a.selfIntroduction());

        TKt.replaceObject(test, "a", b);

        System.out.println("强转前");
        System.out.println(test.a.selfIntroduction());
        System.out.println(test.a.testField);
        System.out.println(test.a.getClass());

        System.out.println("强转后");
        Object obb = test.a;
        System.out.println(((B) obb).selfIntroduction());
        System.out.println(((B) obb).testField);
    }
}

