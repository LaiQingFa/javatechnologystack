package MemoryModle;

public class JavaJvm_HotSpot {

 /*
    http://www.cnblogs.com/springsource/archive/2013/01/11/2856968.html
http://ifeve.com/under-the-hood-runtime-data-areas-javas-memory-model/


内存分配机制：
    https://www.cnblogs.com/zhguang/p/3257367.html#distribution
    http://blog.csdn.net/shimiso/article/details/8595564
    这里所说的内存分配，主要指的是在堆上的分配，一般的，对象的内存分配都是在堆上进行，
    但现代技术也支持将对象拆成标量类型（标量类型即原子类型，表示单个值，可以是基本类型或String等），
    然后在栈上分配，在栈上分配的很少见，我们这里不考虑。

　　Java内存分配和回收的机制概括的说，就是：分代分配，分代回收。
    对象将根据存活的时间被分为：年轻代（Young Generation）、年老代（Old Generation）、
   永久代（Permanent Generation，也就是方法区）。

    年轻代（Young Generation）：对象被创建时，内存的分配首先发生在年轻代（大对象可以直接被创建在年老代），大部分的对象在创建后很快就不再使用，因此很快变得不可达，于是被年轻代的GC机制清理掉（IBM的研究表明，98%的对象都是很快消亡的），这个GC机制被称为Minor GC或叫Young GC。注意，Minor GC并不代表年轻代内存不足，它事实上只表示在Eden区上的GC。
    年轻代上的内存分配是这样的，年轻代可以分为3个区域：Eden区（伊甸园，亚当和夏娃偷吃禁果生娃娃的地方，用来表示内存首次分配的区域，再贴切不过）和两个存活区（Survivor 0 、Survivor 1）。

    年老代（Old Generation）：对象如果在年轻代存活了足够长的时间而没有被清理掉（即在几次Young GC后存活了下来），则会被复制到年老代，年老代的空间一般比年轻代大，能存放更多的对象，在年老代上发生的GC次数也比年轻代少。当年老代内存不足时，将执行Major GC，也叫 Full GC。

    GC机制的基本算法是：分代收集  。
    在GC机制中，起重要作用的是垃圾收集器，垃圾收集器是GC的具体实现，Java虚拟机规范中对于垃圾收集器没有任何规定，所以不同厂商实现的垃圾 收集器各不相同


    */
}
