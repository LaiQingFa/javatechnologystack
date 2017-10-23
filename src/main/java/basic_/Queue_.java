package basic_;

public class Queue_ {
}
/*
LinkedBlockingQueue是一个链表实现的阻塞队列，在链表一头加入元素，如果队列满，就会阻塞，另一头取出元素，如果队列为空，就会阻塞。

        LinkedBlockingQueue内部使用ReentrantLock实现插入锁(putLock)和取出锁(takeLock)。putLock上的条件变量是notFull，即可以用notFull唤醒阻塞在putLock上的线程。takeLock上的条件变量是notEmtpy，即可用notEmpty唤醒阻塞在takeLock上的线程。

        知道了LinkedBlockingQueue，再来理解ArrayBlockingQueue就比较好理解了。类似LinkList和ArrayList的区别。如果知道队列的大小，那么使用ArrayBlockIngQueue就比较合适了，因为它使用循环数组实现，但是如果不知道队列未来的大小，那么使用ArrayBlockingQueue就必然会导致数组的来回复制，降低效率。

        记住多线程保护的一定是数据，而不是代码，在此例中，锁保护的也是其中共享的队列对象，防止出现不一致的情况。出现不一致的情况。*/
