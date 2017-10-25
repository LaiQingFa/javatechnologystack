package basic_;

public class Foreach_ {

/*
    在编译的时候编译器会自动将对for这个关键字的使用转化为对目标的迭代器的使用，这就是foreach循环的原理

    foreach之所以能工作，是因为这些集合类都实现了Iterable接口，该接口中定义了Iterator迭代器的
    产生方法，并且foreach就是通过Iterable接口在序列中进行移动。

    涉及一些压栈、出栈、推送等一些计算机原理性的内容且对于这些字节码指令的知识的理解需要一些C++的知识

    Java将对于数组的foreach循环转换为对于这个数组每一个的循环引用。

    

    http://www.cnblogs.com/slwenyi/p/6393366.html

    1、ArrayList之所以能使用foreach循环遍历，是因为ArrayList所有的List都是Collection的子接口，而Collection是Iterable的子接口，ArrayList的父类AbstractList正确地实现了Iterable接口的iterator方法。之前我自己写的ArrayList用foreach循环直接报空指针异常是因为我自己写的ArrayList并没有实现Iterable接口

    2、任何一个集合，无论是JDK提供的还是自己写的，只要想使用foreach循环遍历，就必须正确地实现Iterable接口

    实际上，这种做法就是23中设计模式中的迭代器模式。
    */
}
