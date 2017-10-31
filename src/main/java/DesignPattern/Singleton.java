package DesignPattern;

//懒汉式单例类.在第一次调用的时候实例化自己
public class Singleton {
    private Singleton() {}
    private static Singleton single=null;
    //静态工厂方法 ，在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的
    public static synchronized  Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
/*
       使用静态内部类
       利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }*/

}


/*

//饿汉式单例类.在类初始化时，已经自行实例化
public class Singleton1 {
    private Singleton1() {}
    private static final Singleton1 single = new Singleton1();
    //静态工厂方法   
    public static Singleton1 getInstance() {
        return single;
    }
}  */
