package multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class LockClass {

    public static void main(String[] args) {
        ReentrantLock lockOne = new ReentrantLock();

        ReentrantLockClass objectOne = new ReentrantLockClass();
        Thread threadOne = new Thread(() -> objectOne.produce(lockOne));

        ReentrantLockClass objectTwo = new ReentrantLockClass();
        Thread threadTwo = new Thread(() -> objectTwo.produce(lockOne));

        threadOne.start();
        threadTwo.start();

        String stringOne = "Hello";
        String stringTwo = "Hello";
        String stringThree = new String("Hello");
        boolean firstCondition = stringOne == stringTwo;
        boolean secondCondition = stringOne == stringThree;
        System.out.println("One and two: " + firstCondition);
        System.out.println("One and Three: " + secondCondition);

        Increment increment = new Increment();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100000; i++) {
                increment.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100000; i++) {
                increment.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 100000; i++) {
                increment.increment();
            }
        });
         t1.start();
         t2.start();
         t3.start();
         try{
             t1.join();
             t2.join();
             t3.join();
         } catch (Exception e) {

         }
         System.out.println(increment.getCount());
        System.out.println("Main Thread is exiting: " + Thread.currentThread().getName());
    }
}
