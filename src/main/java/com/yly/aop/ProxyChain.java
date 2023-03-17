package com.yly.aop;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 代理调用信息  切点代理方法
 */
@Data
public class ProxyChain {
    /**
     * 切点的方法
     */
    private Method   method;
    /**
     * 切点的对象
     */
    private Object   target;
    /**
     * 切点的参数
     */
    private Object[] args;

    public ProxyChain(Method method, Object target, Object... args) {
        this.method = method;
        this.target = target;
        this.args = args;
    }

    public Object invoker() throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(target, args);
    }
}