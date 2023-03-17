package com.yly.jdk8;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/5 下午3:12
 * @since 1.0
 */
public class InputStreamTransfer {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        FileOutputStream fileOutputStream = new FileOutputStream("");
        fileInputStream.transferTo(fileOutputStream);
        fileInputStream.read();
//        ByteArrayInputStream inputStream = new ByteArrayInputStream("haha".getBytes(StandardCharsets.UTF_8));
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        inputStream.transferTo(outputStream);
//        System.out.println(outputStream.toString(StandardCharsets.UTF_8));
    }
}
