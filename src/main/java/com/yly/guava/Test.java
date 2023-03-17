package com.yly.guava;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Throwables;
import com.google.common.collect.*;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Hashing;
import com.google.common.hash.PrimitiveSink;
import com.yly.kotlin.Person;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicMarkableReference;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/9/24 上午10:11
 * @since 1.0
 */
public class Test {

    static Student student_A = new Student("yuliyang", 12);
    static Student student_B = new Student("xiaoming", 22);

    private enum PersonFunnel implements Funnel<Student> {
        INSTANCE;

        @Override
        public void funnel(Student student, PrimitiveSink into) {
            into.putString(student.getName(), Charsets.UTF_8)
                    .putInt(student.getAge());
        }
    }

    public static void main(String[] args) {
        testHasher();
    }

    private static void testHasher() {
//        System.out.println(Hashing.goodFastHash(256).newHasher().putString("haha", Charsets.UTF_8).hash().asInt());

        BloomFilter<Student> friends = BloomFilter.create(PersonFunnel.INSTANCE, 500, 0.0001);
        friends.put(student_A);
        if (friends.mightContain(student_B)) {
            System.out.println("catch it");
        } else {
            System.out.println("not found");
        }
    }

    /**
     * 不可变集合
     */
    private static void testImmutable() {
        ImmutableList list = ImmutableList.of(student_A, student_B);
    }

    /**
     * 测试Throwable
     */
    private static void testThrowable() throws IllegalAccessException {
        try {
            throw new RuntimeException();
        } catch (Throwable throwable) {
//            Throwables.throwIfUnchecked(throwable);
            Throwables.throwIfInstanceOf(throwable, IllegalAccessException.class);
        }
    }
}

class Student implements Comparable {
    private String name;
    private int    age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof Student) {
            return ComparisonChain.start()
                    .compare(name, ((Student) o).name)
                    .compare(age, ((Student) o).age)
                    .result();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
