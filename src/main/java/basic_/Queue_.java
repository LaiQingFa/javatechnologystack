package basic_;

public class Queue_ {
}
/*
LinkedBlockingQueue是一个链表实现的阻塞队列，在链表一头加入元素，如果队列满，就会阻塞，另一头取出元素，如果队列为空，就会阻塞。


LinkedBlockingQueue常用方法如下：
add(anObject)：
把anObject添加到BlockingQueue里，添加成功返回true，如果BlockingQueue空间已满则抛出异常。
offer(anObject)：
表示如果可能的话，将anObject加到BlockingQueue里，即如果BlockingQueue可以容纳，则返回true，否则返回false。
put(anObject)：
把anObject加到BlockingQueue里，如果BlockingQueue没有空间，则调用此方法的线程被阻断直到BlockingQueue里有空间再继续。
poll(time)：
获取并移除此队列的头，若不能立即取出，则可以等time参数规定的时间，取不到时返回null。
take()：
获取BlockingQueue里排在首位的对象，若BlockingQueue为空，阻断进入等待状态直到BlockingQueue有新的对象被加入为止。
clear()：
从队列彻底移除所有元素。
remove()方法直接删除队头的元素
peek()方法直接取出队头的元素，并不删除


适用阻塞队列的好处：多线程操作共同的队列时不需要额外的同步，另外就是队列会自动平衡负载，即那边（生产与消费两边）处理快了就会被阻塞掉，从而减少两边的处理速度差距。
当许多线程共享访问一个公共 collection 时，ConcurrentLinkedQueue 是一个恰当的选择。
LinkedBlockingQueue 多用于任务队列
ConcurrentLinkedQueue  多用于消息队列

多个生产者，对于LBQ性能还算可以接受；但是多个消费者就不行了mainLoop需要一个timeout的机制，否则空转，cpu会飙升的。LBQ正好提供了timeout的接口，更方便使用
如果CLQ，那么我需要收到处理sleep

单生产者，单消费者  用 LinkedBlockingqueue
多生产者，单消费者   用 LinkedBlockingqueue
单生产者 ，多消费者   用 ConcurrentLinkedQueue ConcurrentLinkedQueue  LinkedBlockingqueue
多生产者 ，多消费者   用 ConcurrentLinkedQueue

http://blog.csdn.net/jiangguilong2000/article/details/11617529

        LinkedBlockingQueue内部使用ReentrantLock实现插入锁(putLock)和取出锁(takeLock)。putLock上的条件变量是notFull，即可以用notFull唤醒阻塞在putLock上的线程。takeLock上的条件变量是notEmtpy，即可用notEmpty唤醒阻塞在takeLock上的线程。

        知道了LinkedBlockingQueue，再来理解ArrayBlockingQueue就比较好理解了。类似LinkList和ArrayList的区别。如果知道队列的大小，那么使用ArrayBlockIngQueue就比较合适了，因为它使用循环数组实现，但是如果不知道队列未来的大小，那么使用ArrayBlockingQueue就必然会导致数组的来回复制，降低效率。

        记住多线程保护的一定是数据，而不是代码，在此例中，锁保护的也是其中共享的队列对象，防止出现不一致的情况。出现不一致的情况。*/
