package com.yly.aop;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Data
public class MyProceedingJoinPoint {
    /**
     * 目标方法的参数
     */
    private Object[]         args;
    /**
     * 目标对象
     */
    private Object           target;
    /**
     * 目标方法
     */
    private Method           method;
    /**
     * 存在的调用链
     */
    private List<ProxyChain> proxyChains = new ArrayList<>(8);
    /**
     * 当前调用链的指针位置
     */
    private int              chainsIndex = 0;

    public Object proceed(Object[] args) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target);
    }
}
