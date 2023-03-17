package com.yly;

import java.lang.reflect.ParameterizedType;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/10/9 下午1:34
 * @since 1.0
 */
public class GenericTest {

    public static void main(String[] args) throws Exception {
        GenericSuperClass<String> test = new GenericSuperClass<>();
        System.out.println(test.getClass().getDeclaredField("name").getGenericType());
//        ParameterizedType type = (ParameterizedType) test.getClass().getGenericSuperclass();
//        System.out.println(type.getActualTypeArguments()[0]);
    }
}

class GenericSuperClass<T> {

    T name;

}

class GenericChildClass extends GenericSuperClass<String> {
}