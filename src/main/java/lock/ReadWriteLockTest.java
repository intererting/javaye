package lock;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/15 下午2:50
 * @since 1.0
 */
public class ReadWriteLockTest {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        new Thread(() -> {
            System.out.println("获取read lock");
            lock.readLock().lock();
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            System.out.println("获取write lock");
            lock.readLock().lock();
            System.out.println("获取write lock 成功");
        }).start();
    }
}
