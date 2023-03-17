package com.yly;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2020/11/30 上午10:35
 * @since 1.0
 */
public class TestBitmap {

    public static void main(String[] args) {
//        byte i = (byte) (1 << ((16 + 7) & 7));
//        System.out.println(i);

//        System.out.println(Integer.toBinaryString((byte) 1L));

        BitMap bitMap = new BitMap();
        bitMap.put(7);
        System.out.println(bitMap.get(7));

//        BitSet bitSet = new BitSet();
//        bitSet.set(65);
    }
}

class BitMap {
    private byte[] result = new byte[1 << (Integer.SIZE - 3)];

    void put(int value) {
        result[value >> 3] |= (1 << (value & 7));
    }

    boolean get(int value) {
        System.out.println(result[value >> 3]);
        System.out.println((byte) (1 << (value & 7)));
        return (result[value >> 3] & ((byte) (1 << (value & 7)))) != 0;
    }
}
