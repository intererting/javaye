package com.yly;

import io.netty.util.concurrent.CompleteFuture;
import sun.misc.Unsafe;

import javax.swing.text.AbstractDocument;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.Ref;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;


class ThreadTest {
    private boolean stop = false;

    void startThread() throws InterruptedException {
        while (!stop) {
            System.out.println("xxx");
            Thread.sleep(2000);
        }
    }
}

class ReflectFather {
    ReflectFather() {
        System.out.println("constructor");
    }

    {
        System.out.println("init");
    }

    static {
        System.out.println("static init");
    }

}

class ReflectTest extends ReflectFather {

    final static String name = "haha";

    static void test() {
        System.out.println("test");
    }

    ReflectTest() {
        System.out.println("ReflectTest constructor");
    }

    {
        System.out.println("ReflectTest init");
    }

    static {
        System.out.println("ReflectTest static init");
    }
}

class CloneTest {
    String name;
}

public class Main {

//    ReflectTest test = new ReflectTest();
//
//    static void test() {
//        try {
//            try {
//                throw new RuntimeException("hhaha");
//            } catch (Exception e) {
//                throw e;
//            } finally {
//                System.out.println("finally");
//            }
//        } finally {
//            System.out.println("outer finally");
//        }
//    }

//    char[] value = {'y'};
//
//    public static void test(int a) {
//        System.out.println("int");
//    }
//
//    public static void test(Integer a) {
//        System.out.println("Integer");
//    }
//
//    public static void main(String[] args) {

//        String a = Math.random() + "";
//        String b = Math.random() + "";
//        if (!a.equals("1") || !b.equals("2")) {
//            System.out.println("xx");
//        } else {
//            System.out.println("xxx");
//        }

//        System.out.println(TimeUnit.SECONDS.toMillis(10));

//        test(1);

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss Z");
//        String result = dateTimeFormatter.format(LocalDate.of(2022, 12, 12).atStartOfDay());
//        System.out.println(result);
//        BitSet bitSet = new BitSet();
//        bitSet.set(Integer.MAX_VALUE, true);
//        System.out.println(bitSet.get(Integer.MAX_VALUE));

//        System.out.println(~0);


//        BigInteger bigInteger = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//        System.out.println(bigInteger.doubleValue());
//
//        System.out.println(Integer.parseInt("11111", 10));

//        CloneTest cloneTest = new CloneTest();
//        cloneTest.name = "yuliyang";
//        CloneTest[] tests = {cloneTest};
//        CloneTest[] cloneTests = tests.clone();
//        cloneTests[0].name = "haha";
//        System.out.println(cloneTest.name);

//        ArrayList<? extends Number> array = new ArrayList<>();
//        ArrayList<Double> doubles = new ArrayList<>();
//        array = doubles;


//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        IntStream.range(0, 15).forEach(arrayDeque::offerFirst);
//        arrayDeque.offerFirst(15);


//        String name = "yuliyang";
    //数组反射
//        try {
//            Main main = new Main();
//            Field valueField = Main.class.getDeclaredField("value");
//            valueField.setAccessible(true);
//            char[] value = (char[]) valueField.get(main);
//            value[0] = 'H';
//            System.out.println(main.value);
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }

//        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
//
//        map.put("name", "yuliyang");
//        map.put("age", "12");
//        map.put("height", "1.2");

//        new Main();
//        new ReflectTest();


//        ReflectTest.test();
//        System.out.println(ReflectTest.name);
//        new Main();
//        testAtomic();

//        testTreeMap();

//        testDirectBuffer();
//        System.out.println("xxx");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        String[] a = {"1", "3", "4", "2"};
//        Arrays.sort(a, (Comparator<String>) (o1, o2) -> {
//            System.out.println(o1);
//            System.out.println(o2);
//            System.out.println(o1.compareTo(o2));
//            System.out.println("-----------------");
//            return o2.compareTo(o1);
//        });
//
//        System.out.println(Arrays.toString(a));

//        testCompletableFuture();

//        testConcurentBlockingQueue();
//        System.out.println(String.class.getClassLoader());

//        TreeMap<String, String> map = new TreeMap();
//        map.put("2", "yuliyang");
//        map.put("1", "yuliyang");
//        map.put("3", "yuliyang");
//
//        map.forEach((key, value) -> {
//            System.out.println(key + "   " + value);
//        });
//
//        StringBuilder builder = new StringBuilder();
//        builder.append("xx");
//
//        StringBuffer buffer = new StringBuffer();
//        buffer.append("x");

    // write your code here
//        ExecutorService executor = Executors.newCachedThreadPool();
//
//        executor.submit(() -> {
////            while (!Thread.interrupted()) {
////                System.out.println("xxxxx");
////            }
//            System.out.println(Thread.currentThread().hashCode());
//            throw new RuntimeException("xx");
//        });
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        executor.execute(() -> {
//            System.out.println(Thread.currentThread().hashCode());
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("xxxxxxx");
//            }
//        });

//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        executor.shutdownNow();


//        Thread thread = new Thread(() -> {
//            while (!Thread.interrupted()) {
//                System.out.println("xxxxxx");
//            }
//        });
//        thread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread.interrupt();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("over");


//        String s3 = new String("1") + new String("1");
//        s3.intern();
//        String s4 = "11";
//        System.out.println(s3 == s4);


//        String str1 = new String("SEU") + new String("Calvin");
//        System.out.println(str1.intern() == str1);
//        System.out.println(str1 == "SEUCalvin");


//        String str2 = "SEUCalvin";//新加的一行代码，其余不变
//        String str1 = new String("SEU") + new String("Calvin");
//        System.out.println(str1.intern() == str1);
//        System.out.println(str1 == "SEUCalvin");

//        String s = new String("haha");
//        System.out.println(s == "haha");

//        try {
//            Main.class.getClassLoader().loadClass("java.lang.String");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println(formatter.format(LocalDate.now()));

//        System.out.println(" ".getBytes(StandardCharsets.UTF_8).length);
}

    static String name = "yuliyang";

    static boolean stop = false;

    /**
     * 测试一下原子性和可见性
     */
    private static void testAtomic() {

//        AtomicInteger atomicValue = new AtomicInteger(0);
        new Thread(() -> {
            while (!stop) {
                System.out.println("xxx");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        stop = true;
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "hello");
        treeMap.put(2, "world");
        treeMap.put(1, "start");
        SortedMap<Integer, String> subMap = treeMap.tailMap(3);
        subMap.forEach((integer, s) -> {
            System.out.println(integer + " " + s);
        });
    }

    private static void testDirectBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
    }

    private static void testConcurentBlockingQueue() {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        queue.offer("001");

        queue.offer("002");

        System.out.println(queue.peek());

    }

interface Test {

}
}