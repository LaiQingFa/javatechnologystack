package basic_;

/**
 * string的intern方法的内部细节 jdk1.6和jdk1.7的变化以及内部cpp代码StringTable的实现
 */
public class String_intern {

/*
http://www.cnblogs.com/wxgblogs/p/5635099.html

常量池就类似一个JAVA系统级别提供的缓存

String类型的常量池比较特殊。它的主要使用方法有两种：

1.直接使用双引号声明出来的String对象会直接存储在常量池中。
2.如果不是用双引号声明的String对象，可以使用String提供的intern方法。
intern 方法会从字符串常量池中查询当前字符串是否存在，若不存在就会将当前字符串放入常量池中

intern 的实现原理:

      String#intern方法中看到，这个方法是一个 native 的方法，但注释写的非常明了。
      “如果常量池中存在当前字符串, 就会直接返回当前字符串. 如果常量池中没有此字符串, 会将此字符串放入常量池中后, 再返回”。

    */
}
