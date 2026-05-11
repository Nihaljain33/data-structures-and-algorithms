package multiThreading;

public class ProducerConsumerClass {

    public static void main(String[] args) {
        BufferClass bufferClass = new BufferClass();
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 20; i++) {
                    bufferClass.produce(i);
                    Thread.sleep(50);
                }
            } catch(InterruptedException exception) {
                    Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 20; i++) {
                    int value = bufferClass.consume();
                    Thread.sleep(150);
                }
            } catch(InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }

}
