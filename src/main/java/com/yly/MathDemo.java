package com.yly;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/10/30 下午1:26
 * @since 1.0
 */
public class MathDemo {

    public static void main(String[] args) {
        byte a = 0b10;
//        System.out.println(a >> 1);
//        System.out.println(a << 1);
        //在最后+1
//        System.out.println((a << 1) + 1);
        byte b = 0b11;
        //把最后一位变成0
//        System.out.println((b | 1) - 1);
        //最后一位取反
//        System.out.println(b ^ 1);
        byte c = 0b101;
        //把右数第K位变成1
//        System.out.println(Integer.toBinaryString(c | (1 << 1)));
        byte d = 0b10101;
        //把右数第K位变成0
//        System.out.println(Integer.toBinaryString(d & (~(1 << 2))));
        //右数第K位取反
//        System.out.println(Integer.toBinaryString(d ^ (1 << 2)));
        //取末3未
//        printBinaryString(d & 0b111);

        //取右数第K位
//        printBinaryString((d >> 2) & 1);

        //把最后K位变成1
//        printBinaryString(d | (1 << 2 - 1));

        //最后K位取反
//        printBinaryString(d ^ ((1 << 2) - 1));

        //把右边连续的1变成0
        byte e = 0b1000111;
//        printBinaryString(e & (e + 1));

        //把右边第一个0变成1
//        printBinaryString(e | (e + 1));

        byte f = 0b11000;
        //把右边连续的0变成1
//        printBinaryString(f | (f - 1));

        //取右边连续的1
//        printBinaryString((e ^ (e + 1)) >> 1);

        //去掉第一个1的左边
//        printBinaryString(f & (f ^ (f - 1)));

//        testMore();

//        testException();

//        testBigDecimal();

    }

    private static void testBigDecimal() {

        BigDecimal a = new BigDecimal(1.2);
        BigDecimal b = new BigDecimal("1.32");
        System.out.println(a.add(b).doubleValue());
    }

    private static void testException() {
        try {
            innerException();
        } catch (Exception e) {

        }
    }

    private static void innerException() {
        try {
            throw new RuntimeException("my Exception");
        } catch (Exception e) {
        }
        System.out.println("after exception");
    }

    private static void testMore() {
//        System.out.println(count1(7));
//        System.out.println(count0((byte) 8));
//        swap(1, 2);

//        int result = xorEncrypt(323, 10086);
//        System.out.println(result);
//        System.out.println(xorDecode(result, 10086));

//        System.out.println(notChange(3));

//        System.out.println(abs(3));
//        System.out.println(abs(-19));

//        System.out.println(myPow(3, 4));

        System.out.println(findN(17));
    }

    /**
     * 找出不大于N的最大的2的幂指数
     * hash获取容量的时候的算法
     *
     * @param n
     * @return
     */
    private static int findN(int n) {
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8; // 整型一般是 32 位，上面我是假设 8 位。
        return (n + 1) >> 1;
    }

    private static int myPow(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return m;
        }
        int result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= m;
            }
            m *= m;
            n >>= 1;
        }
        return result;
    }

    private static int getMaxInt() {
        return (1 << 31) - 1;//2147483647， 由于优先级关系，括号不可省略
    }

    private static int getMinInt() {
        return 1 << 31;//-2147483648
    }

    private static void printBinaryString(int data) {
        System.out.println(Integer.toBinaryString(data));
    }

    /**
     * 计算2进制中1的数量
     */
    private static int count1(int x) {
        int sum = 0;
        while (x > 0) {
            sum++;
            x = x & (x - 1);
        }
        return sum;
    }

    /**
     * 计算2进制中0的个数
     */
    private static int count0(byte x) {
        int count = 0;
        while (x + 1 > 0) {
            count++;
            x |= (x + 1);
        }
        return count;
    }

    private static void swap(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("after swap " + a + "  " + b);
    }

    private static void positiveAndNegative() {
        int x = -1, y = 2;
        boolean f = ((x ^ y) < 0); // true

//        int x = 3, y = 2;
//        boolean f = ((x ^ y) < 0); // false
    }

    /**
     * 异或运算用于加密
     *
     * @param data
     * @param key
     * @return
     */
    private static int xorEncrypt(int data, int key) {
        return data ^ key;
    }

    /**
     * 异或运算用于解密
     *
     * @param data
     * @param key
     * @return
     */
    private static int xorDecode(int data, int key) {
        return data ^ key;
    }

    private static int notChange(int data) {
        //负数用不补码存，等与按位取反+1
        return ~data + 1;
    }

    /**
     * 取绝对值
     *
     * @param data
     * @return
     */
    private static int abs(int data) {
        int result = (data >> 31) == 0 ? data : ~data + 1;
        return result;
    }
}
