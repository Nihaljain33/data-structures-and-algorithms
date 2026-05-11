package lld.creationpattern.singleton;

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
