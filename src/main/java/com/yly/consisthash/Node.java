package com.yly.consisthash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/6/7 下午4:00
 * @since 1.0
 */
public class Node {

    private final String domain;

    private final String ip;

    public Node(String domain, String ip) {
        this.domain = domain;
        this.ip = ip;
        data = new HashMap<>();
    }

    private Map<String, Object> data;

    public <T> void put(String key, T value) {
        data.put(key, value);
    }

    public void remove(String key) {
        data.remove(key);
    }

    public <T> T get(String key) {
        return (T) data.get(key);
    }

    public String getDomain() {
        return domain;
    }

    public String getIp() {
        return ip;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
