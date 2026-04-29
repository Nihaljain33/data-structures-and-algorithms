package multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    public void produce(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
            System.out.println("Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
