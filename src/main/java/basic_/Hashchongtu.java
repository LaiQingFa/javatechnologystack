package basic_;

/**
 *  hash冲突的解决办法：拉链法
 */
public class Hashchongtu {

/*
 存在一种情况即两个不同对象的hashcode相同，即所谓的hash冲突，链表就是用来解决hash冲突的。

hashmap的源码:

 final Entry<K,V> getEntry(Object key) {
        int hash = (key == null) ? 0 : hash(key.hashCode());
        for (Entry<K,V> e = table[indexFor(hash, table.length)];
             e != null;
             e = e.next) {
            Object k;
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k))))
                return e;
        }
        return null;
    }

    HashCode是使用Key通过Hash函数计算出来的，由于不同的Key，
    通过此Hash函数可能会算的同样的HashCode，所以此时用了拉链法解决冲突，

    拉链法是解决哈希冲突的一种行之有效的方法，某些哈希地址可以被多个关键字值共享，这样可以针对每个哈希地址建立一个单链表。
    在拉链（单链表）的哈希表中搜索一个记录是容易的，首先计算哈希地址，然后搜索该地址的单链表。
    在插入时应保证表中不含有与该关键字值相同的记录，然后按在有序表中插入一个记录的方法进行。针对关键字值相同的情况，现行的处理方法是更新该关键字值中的内容。
    删除关键字值为k的记录，应先在该关键字值的哈希地址处的单链表中找到该记录，然后删除之。

*/


}
