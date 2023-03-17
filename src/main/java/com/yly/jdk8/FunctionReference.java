package com.yly.jdk8;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2022/1/24 下午8:25
 * @since 1.0
 */
public class FunctionReference {
    public static void main(String[] args) {
        test(StudentModel::getName);
    }

    private static void test(SFunction<StudentModel, String> getName) {
        for (Method method : getName.getClass().getDeclaredMethods()) {
            if (method.getName().equals("writeReplace")) {
                method.setAccessible(true);
                try {
                    SerializedLambda serializedLambda = (SerializedLambda) method.invoke(getName);
                    System.out.println(serializedLambda.getImplMethodName());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class StudentModel {
    private String name;

    public String getName() {
        return name;
    }
}
