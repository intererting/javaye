package com.yly.aop;

import java.lang.annotation.*;

/**
 * 模拟一个环绕通知
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAround {
    /**
     * 要拦截的携带什么注解的方法
     *
     * @return 返回这个注解的class
     */
    Class<? extends Annotation> targetClass();
}