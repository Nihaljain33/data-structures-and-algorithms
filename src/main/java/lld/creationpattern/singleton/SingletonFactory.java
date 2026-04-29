package lld.creationpattern.singleton;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.HashMap;
import java.util.Map;

public class SingletonFactory {

    private static volatile SingletonFactory singletonFactory;
    private SingletonFactory(){}

    public static SingletonFactory getInstance() {
        if(singletonFactory == null) {
            synchronized (SingletonFactory.class) {
                if(singletonFactory == null) {
                    singletonFactory = new SingletonFactory();
                }
            }
        }
        return singletonFactory;
    }
}
