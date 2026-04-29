package multiThreading;

import java.util.ArrayList;
import java.util.List;

public class BufferClass {

    public static final int BUFFER_SIZE = 10;
    public final List<Integer> buffer = new ArrayList<>();

    public synchronized void produce(int value) throws InterruptedException {
        while(buffer.size() == BUFFER_SIZE) {
            System.out.println("Buffer is full. Producer is waiting");
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while(buffer.isEmpty()) {
            System.out.println("Buffer empty. Consumer is waiting.");
            wait();
        }
        int value = buffer.remove(0);
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}
