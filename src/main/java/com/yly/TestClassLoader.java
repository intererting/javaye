package com.yly;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public class TestClassLoader {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);


//        char a = 300;
//        System.out.println(Integer.valueOf(Byte.MAX_VALUE));
//        try (FileOutputStream filterOutputStream = new FileOutputStream("/home/yuliyang/Desktop/test.txt");
//             FileInputStream inputStream = new FileInputStream("/home/yuliyang/Desktop/test.txt")) {
//            filterOutputStream.write(a >>> 8);
//            filterOutputStream.write(a & 0xFF);
//            byte[] bytes = new byte[2];
//            inputStream.read(bytes);
//            System.out.println((int) bytes[0] << 8 | bytes[1]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        byte[] bytes = new byte[2];
//        bytes[0] = (byte) (a >>> 8);
//        bytes[1] = (byte) (a & 0xFF);
//        System.out.println(Integer.toBinaryString(bytes[0] << 8 | bytes[1]));
//        System.out.println((int) bytes[0] << 8 | bytes[1]);


//        try {
//            URLClassLoader urlClassLoader = new URLClassLoader(
//                    new URL[]{new URL("file:///home/yuliyang/Desktop/com/yly/MyClass.class")}
//            );
//            Class clazz = urlClassLoader.loadClass("com.yly.MyClass");
//            MyClass myClass = (MyClass) clazz.getConstructor().newInstance();
//            myClass.test();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
