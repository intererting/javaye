package com.yly.consisthash;

import java.util.stream.IntStream;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/6/7 下午4:02
 * @since 1.0
 */
public class Main {

    private final static int    DATA_COUNT = 10_000;
    private final static String PRE_KEY    = "key";

    public static void main(String[] args) {
//        testNormalHash();
        testConsistHash();
    }

    private static void testConsistHash() {
        ConsistencyHashCluster cluster = new ConsistencyHashCluster();
        cluster.addNode(new Node("c1.yywang.info", "192.168.0.1"));
        cluster.addNode(new Node("c2.yywang.info", "192.168.0.2"));
        cluster.addNode(new Node("c3.yywang.info", "192.168.0.3"));
        cluster.addNode(new Node("c4.yywang.info", "192.168.0.4"));

        IntStream.range(0, DATA_COUNT)
                .forEach(index -> {
                    //hash更均匀
                    Node node = cluster.get(PRE_KEY + index * 10000);
                    node.put(PRE_KEY + index, "Test Data");
                });

        System.out.println("数据分布情况：");
        cluster.nodes.forEach(node -> {
            System.out.println("IP:" + node.getIp() + ",数据量:" + node.getData().size());
        });

        //缓存命中率
        long hitCount = IntStream.range(0, DATA_COUNT)
                .filter(index -> cluster.get(PRE_KEY + index * 10000).get(PRE_KEY + index) != null)
                .count();
        System.out.println("缓存命中率：" + hitCount * 1f / DATA_COUNT);

        //新增节点缓存命中率
        cluster.addNode(new Node("c5.yywang.info", "192.168.0.5"));

        long hitCountAdd = IntStream.range(0, DATA_COUNT)
                .filter(index -> cluster.get(PRE_KEY + index * 10000).get(PRE_KEY + index) != null)
                .count();
        System.out.println("新增后缓存命中率：" + hitCountAdd * 1f / DATA_COUNT);
    }

    private static void testNormalHash() {
        Cluster cluster = new NormalHashCluster();
        cluster.addNode(new Node("c1.yywang.info", "192.168.0.1"));
        cluster.addNode(new Node("c2.yywang.info", "192.168.0.2"));
        cluster.addNode(new Node("c3.yywang.info", "192.168.0.3"));
        cluster.addNode(new Node("c4.yywang.info", "192.168.0.4"));

        IntStream.range(0, DATA_COUNT)
                .forEach(index -> {
                    Node node = cluster.get(PRE_KEY + index);
                    node.put(PRE_KEY + index, "Test Data");
                });

        System.out.println("数据分布情况：");
        cluster.nodes.forEach(node -> {
            System.out.println("IP:" + node.getIp() + ",数据量:" + node.getData().size());
        });

        //缓存命中率
        long hitCount = IntStream.range(0, DATA_COUNT)
                .filter(index -> cluster.get(PRE_KEY + index).get(PRE_KEY + index) != null)
                .count();
        System.out.println("缓存命中率：" + hitCount * 1f / DATA_COUNT);

        //新增节点缓存命中率
        cluster.addNode(new Node("c5.yywang.info", "192.168.0.5"));

        long hitCountAdd = IntStream.range(0, DATA_COUNT)
                .filter(index -> cluster.get(PRE_KEY + index).get(PRE_KEY + index) != null)
                .count();
        System.out.println("新增后缓存命中率：" + hitCountAdd * 1f / DATA_COUNT);
    }
}
