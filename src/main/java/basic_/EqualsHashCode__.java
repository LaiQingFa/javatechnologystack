package basic_;

public class EqualsHashCode__ {


/*
http://blog.csdn.net/tiantiandjava/article/details/46988461

    在java中：
            ==是运算符，用于比较两个变量是否相等。
    equals，是Objec类的方法，用于比较两个对象是否相等，默认Object类的equals方法是比较两个对象的地址，跟==的结果一样。


hashCode也是Object类的一个方法。返回一个离散的int型整数。在集合类操作中使用，为了提高查询速度。（HashMap，HashSet等）

http://www.cnblogs.com/lulipro/p/5628750.html


这个方法返回对象的散列码，返回值是int类型的散列码。
对象的散列码是为了更好的支持基于哈希机制的Java集合类，例如 Hashtable, HashMap, HashSet 等。


关于hashCode方法，一致的约定是：
重写了euqls方法的对象必须同时重写hashCode()方法。

如果2个对象通过equals调用后返回是true，那么这个2个对象的hashCode方法也必须返回同样的int型散列码

如果2个对象通过equals返回false，他们的hashCode返回的值允许相同。(然而，程序员必须意识到，hashCode返回独一无二的散列码，会让存储这个对象的hashtables更好地工作。)

第一：在某个运行时期间，只要对象的（字段的）变化不会影响equals方法的决策结果，那么，在这个期间，无论调用多少次hashCode，都必须返回同一个散列码。


第二：通过equals调用返回true 的2个对象的hashCode一定一样。


第三：通过equasl返回false 的2个对象的散列码不需要不同，也就是他们的hashCode方法的返回值允许出现相同的情况。

总结一句话：等价的(调用equals返回true)对象必须产生相同的散列码。不等价的对象，不要求产生的散列码不相同。



    */



























}
