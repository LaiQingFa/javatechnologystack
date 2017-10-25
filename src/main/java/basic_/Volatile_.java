package basic_;
//Volatile定义与原理
public class Volatile_ {

/*
Java编程语言允许线程访问共享变量，为了确保共享变量能被准确和一致地更新，线程应该通过排它锁单独获取这个变量
Java语言提供了Violatile来确保多处理开发中，共享变量的“可见性”，即当另外一个线程修改一个共享变量时，另外一个线程能读到这个修改的值。
它是轻量级的synchronized，不会引起线程上下文的切换和调度，执行开销更小。

使用Violatile修饰的变量在汇编阶段，会多出一条lock前缀指令，它在多核处理器下回引发两件事情：
将当前处理器缓存行的数据写回到系统内存
这个写回内存的操作会使在其他CPU里缓存了该内存地址的数据无效

volatile是一种“轻量级的锁”，它能保证锁的可见性，但不能保证锁的原子性。

http://blog.csdn.net/tenfyguo/article/details/24999141
    */
}
