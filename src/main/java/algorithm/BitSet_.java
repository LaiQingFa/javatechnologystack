package algorithm;
/*BitSet类
        大小可动态改变, 取值为true或false的位集合。用于表示一组布尔标志。*/
public class BitSet_ {

/*
    http://www.blogjava.net/hello-yun/archive/2013/06/14/400544.html


    此类实现了一个按需增长的位向量。位 set 的每个组件都有一个 boolean 值。用非负的整数将 BitSet 的位编入索引。可以对每个编入索引的位进行测试、设置或者清除。通过逻辑与、逻辑或和逻辑异或操作，可以使用一个 BitSet 修改另一个 BitSet 的内容。
    默认情况下，set 中所有位的初始值都是 false。
    每个位 set 都有一个当前大小，也就是该位 set 当前所用空间的位数。注意，这个大小与位 set 的实现有关，所以它可能随实现的不同而更改。位 set 的长度与位 set 的逻辑长度有关，并且是与实现无关而定义的。
    除非另行说明，否则将 null 参数传递给 BitSet 中的任何方法都将导致 NullPointerException。 在没有外部同步的情况下，多个线程操作一个 BitSet 是不安全的。*/

    /*java.util.BitSet 研究（存数海量数据时的一个途径）
    *
    *
    *java.util.BitSet可以按位存储。
    计算机中一个字节（byte）占8位（bit），我们java中数据至少按字节存储的，
    比如一个int占4个字节。
    如果遇到大的数据量，这样必然会需要很大存储空间和内存。
    如何减少数据占用存储空间和内存可以用算法解决。
    java.util.BitSet就提供了这样的算法。
    比如有一堆数字，需要存储，source=[3,5,6,9]
    用int就需要4*4个字节。
    java.util.BitSet可以存true/false。
    如果用java.util.BitSet，则会少很多，其原理是：
    1，先找出数据中最大值maxvalue=9
    2，声明一个BitSet bs,它的size是maxvalue+1=10
    3，遍历数据source，bs[source[i]]设置成true.
    最后的值是：
    (0为false;1为true)
    bs [0,0,0,1,0,1,1,0,0,1]
    3, 5,6, 9
    这样一个本来要int型需要占4字节共32位的数字现在只用了1位！
    比例32:1
    *
    *
    *
    *
    *
    *
    *
    *
    * */


}
