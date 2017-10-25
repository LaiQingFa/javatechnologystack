package basic_;

//static、final、transient等关键字的作用
public class S_F_T {

/*
http://blog.csdn.net/nicewuranran/article/details/52294824

static关键字，通常用来修饰变量和方法以及静态代码块。被修饰的变量表示为类所有对象所共有的，被修饰的方法表示类的方法。
static的作用域是类而非某个具体对象。
static还有时常喝final一起组合使用，static final
static修饰的方法通常是public的
static代码块是在类加载到内存时执行的。


final关键字意思就是表示不可变


transient关键字表示瞬态、临时的，其不能序列化到文件中。
通常如果想要将一个对象持久化存储到磁盘中，那么通常是先将该对象序列化然后再存储。
transient的作用就是阻止它所修饰的属性被序列化，瞬态的意思。
比如:
网络上传输一些客户的资料,但是对于非常敏感的数据(比如薪资，各类密码之类的)我们担心在传输过程中这些敏感数据被窃取

既然说到序列化，那就顺便提一下，如果一个变量是static的，那么无论是否有transient修饰词，都不能够别序列化，
因为序列化是序列化一个对象，static变量根本不属于任何对象
在Java中想让对象实现序列化，可以通过两种方式

1、实现Serializable接口，这种情况下，对象的序列化和反序列化都是java自己的机制自动实现的，不需要人为实现；

2、实现Externalizable接口，可以实现writeExternal()和readExternal()这两个方法，完成自己的序列化/反序列化操作；

备注:方式1比较常用，也比较简单。



*/

}



