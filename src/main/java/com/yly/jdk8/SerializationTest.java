package com.yly.jdk8;

import kotlin.text.Charsets;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/15 下午3:50
 * @since 1.0
 */
public class SerializationTest {
    public static void main(String[] args) {
        Student student = new Student("yuliyang", 30);
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            outputStream.writeObject(student);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
            Student student1 = (Student) inputStream.readObject();
            System.out.println(student1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {
    private String name;
    private int    age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
