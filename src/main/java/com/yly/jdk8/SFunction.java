package com.yly.jdk8;

import java.io.Serializable;
import java.util.function.Function;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2022/1/25 上午8:59
 * @since 1.0
 */
public interface SFunction<T, R> extends Function<T, R>, Serializable {
}
