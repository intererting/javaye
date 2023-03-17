package com.yly.consisthash;

import java.util.Objects;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/6/7 下午4:01
 * @since 1.0
 */
public class NormalHashCluster extends Cluster {

    public NormalHashCluster() {
        super();
    }

    @Override
    public void addNode(Node node) {
        this.nodes.add(node);
    }

    @Override
    public void removeNode(Node node) {
        this.nodes.removeIf(o -> o.getIp().equals(node.getIp()) ||
                o.getDomain().equals(node.getDomain()));
    }

    @Override
    public Node get(String key) {
        int hash = Math.abs(Objects.hash(key));
        int index = hash % nodes.size();
        return nodes.get(index);
    }
}