package com.yly;

import java.awt.*;
import java.util.Locale;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/16 上午11:32
 * @since 1.0
 */
public class Font {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = ge.getAvailableFontFamilyNames(Locale.CHINA);
        for (int i = 0; i < fontName.length; i++) {
            System.out.println(fontName[i]);
        }
    }
}
