package com.yly.consisthash;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/6/7 下午4:01
 * @since 1.0
 */
public abstract class Cluster {

    protected static final int MAX_HASH_SIZE = 65535;

    protected List<Node> nodes;

    public Cluster() {
        this.nodes = new ArrayList<>();
    }

    public abstract void addNode(Node node);

    public abstract void removeNode(Node node);

    public abstract Node get(String key);

    protected int hash(String key) {
        return Math.abs(key.hashCode()) % MAX_HASH_SIZE;
    }
}
