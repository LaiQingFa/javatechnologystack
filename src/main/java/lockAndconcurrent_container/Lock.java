package lockAndconcurrent_container;

public class Lock {

/*
    http://blog.csdn.net/wojiushiwo945you/article/details/42292999
    独占锁、共享锁；可重入的独占锁ReentrantLock、共享锁 实现原理
    公平锁和非公平锁
    java并发包提供的加锁模式分为独占锁和共享锁，独占锁模式下，
    每次只能有一个线程能持有锁，ReentrantLock就是以独占方式实现的互斥锁。
    共享锁，则允许多个线程同时获取锁，并发访问 共享资源，如：ReadWriteLock。

    锁的公平与非公平，是指线程请求获取锁的过程中，是否允许插队。在公平锁上，
    线程将按他们发出请求的顺序来获得锁而非公平锁则允许在线程发出请求后立即尝试获取锁，
    如果可用则可直接获取锁，尝试失败才进行排队等待



    读写锁 ReentrantReadWriteLock的实现原理
    http://blog.csdn.net/yanyan19880509/article/details/52435135
    https://www.cnblogs.com/zhangxsh/p/3567869.html
    ReentrantReadWriteLock的锁策略有两种，分为公平策略和非公平策略
    真正的实现Lock接口的类就三个，ReentrantLock和ReentrantReadWriteLock的两个内部类
    （ReentrantReadWriteLock实现了ReadWriteLock接口，并没有实现Lock接口，
    是其内部类ReadLock和WriteLock实现了Lock的接口），
    其他都是通过我们前面说的一些工具类实现了线程的阻塞。




    */

}
