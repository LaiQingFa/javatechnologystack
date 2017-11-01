package DesignPattern;
//ThreadLocal模式的实现机理
public class ThreadLocalPattern {

/*

http://blog.csdn.net/hua286306956/article/details/8660268
    在JDK的早期版本中,提供了一种解决多线程并发问题的方案: java.lang.ThreadLocal类.ThreadLocal类在维护变量时,实际使用了当前线程（Thread）中的一个叫做ThreadLocalMap的独立副本,每个线程可以独立修改属于自己的副本而不会互相影响,从而隔离了线程和线程,避免了线程访问实例变量发生冲突的问题.
            ThreadLocal本身并不是一个线程,而是通过操作当前线程（Thread）中的一个内部变量来达到与其他线程隔离的目的.之所以取名为ThreadLocal,所期望表达的含义是其操作的对象是线程（Thread）的一个本地变量.如果我们看一下Thread的源码实现,就会发现这一变量,

:1. ThreadLocalMap变量属于线程（Thread）的内部属性,不同的线程（Thread）拥有完全不同的ThreadLocalMap变量.
2. 线程（Thread）中的ThreadLocalMap变量的值是在ThreadLocal对象进行set或者get操作时创建的.
3. 在创建ThreadLocalMap之前,会首先检查当前线程（Thread）中的ThreadLocalMap变量是否已经存在,如果不存在则创建一个；如果已经存在,则使用当前线程（Thread）已创建的ThreadLocalMap.
4. 使用当前线程（Thread）的ThreadLocalMap的关键在于使用当前的ThreadLocal的实例作为key进行存储ThreadLocal模式,至少从两个方面完成了数据访问隔离,有了横向和纵向的两种不同的隔离方式,ThreadLocal模式就能真正地做到线程安全：纵向隔离 —— 线程（Thread）与线程（Thread）之间的数据访问隔离.这一点由线程（Thread）的数据结构保证.因为每个线程（Thread）在进行对象访问时,访问的都是各自线程自己的ThreadLocalMap.横向隔离 —— 同一个线程中,不同的ThreadLocal实例操作的对象之间的相互隔离.这一点由ThreadLocalMap在存储时,采用当前ThreadLocal的实例作为key来保证.

深入比较TheadLocal模式与synchronized关键字
　　ThreadLocal模式synchronized关键字都用于处理多线程并发访问变量的问题,只是二者处理问题的角度和思路不同.
　　1）ThreadLocal是一个java类,通过对当前线程中的局部变量的操作来解决不同线程的变量访问的冲突问题.所以,ThreadLocal提供了线程安全的共享对象机制,每个线程都拥有其副本.
　　2）Java中的synchronized是一个保留字,它依靠JVM的锁机制来实现临界区的函数或者变量的访问中的原子性.在同步机制中,通过对象的锁机制保证同一时间只有一个线程访问变量.此时,被用作“锁机制”的变量时多个线程共享的.
　　同步机制(synchronized关键字)采用了“以时间换空间”的方式,提供一份变量,让不同的线程排队访问.而ThreadLocal采用了“以空间换时间”的方式,为每一个线程都提供一份变量的副本,从而实现同时访问而互不影响
*/

}
