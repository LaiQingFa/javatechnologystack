package basic_;

public class String_pool {

    /*对于JVM中方法区，永久代，元空间以及字符串常量池的迁移和string.intern方法
    *http://www.importnew.com/10756.html
    *http://www.cnblogs.com/hadoop-dev/p/7169252.html
    *
    *运行时常量池在JDK1.6及之前版本的JVM中是方法区的一部分，而在HotSpot虚拟机中方法区放在了”永久代(Permanent Generation)”。所以运行时常量池也是在永久代的。
但是JDK1.7及之后版本的JVM已经将运行时常量池从方法区中移了出来，在Java 堆（Heap）中开辟了一块区域存放运行时常量池。
    *
    *
    *
    *
    *
    * */
}
