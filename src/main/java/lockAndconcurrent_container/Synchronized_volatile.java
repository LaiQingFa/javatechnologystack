package lockAndconcurrent_container;

public class Synchronized_volatile {

/*
    线程同步Volatile与Synchronized详解

    http://blog.csdn.net/seu_calvin/article/details/52370068

    java最初被设计为一种安全的受控环境。尽管如此，Java HotSpot还是包含了一个“后门”，提供了一些可以直接操控内存和线程的低层次操作。这个后门类——sun.misc.Unsafe——被JDK广泛用于自己的包中，如java.nio和java.util.concurrent。但是丝毫不建议在生产环境中使用这个后门。因为这个API十分不安全、不轻便、而且不稳定。

    CAS操作是通过compareAndSwapXXX方法实现的
    CAS操作有3个操作数，内存值M，预期值E，新值U，如果M==E，则将内存值修改为B，否则啥都不做。

    http://blog.csdn.net/bluetjs/article/details/52758095


    CAS和ABA问题

https://www.cnblogs.com/exceptioneye/p/5373498.html


    同步器AQS的实现原理
    https://www.cnblogs.com/200911/p/6031350.html
    */



}
