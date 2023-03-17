package com.yly.aop;

public class TestMyProxy {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InterruptedException {
        BeanUtil beanUtil = new BeanUtil();
        beanUtil.initBean();
        TestService testService = beanUtil.getBean("testService");
        System.out.println(testService.print("wqewqeqw"));
        testService.sendUser();
    }
}