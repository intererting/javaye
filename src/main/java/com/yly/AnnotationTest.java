package com.yly;

import java.lang.annotation.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/9/22 下午3:42
 * @since 1.0
 */
public class AnnotationTest {

    public static void main(String[] args) {
//        TestAnotation[] annotations = Person.class.getDeclaredAnnotationsByType(TestAnotation.class);
//        TestAnotation annotation = annotations[0];
//        System.out.println(annotation.name());
        ParameterizedType type = (ParameterizedType) PersonSon.class.getGenericSuperclass();
        System.out.println(type.getActualTypeArguments()[0].getTypeName());
    }
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TestAnotation {

    String name();
}

@TestAnotation(name = "haha")
class Person<T> {

}

class PersonSon extends Person<String> {

}
