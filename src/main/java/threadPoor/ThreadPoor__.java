package threadPoor;

public class ThreadPoor__ {
/*
    线程池的原理及实现
    http://blog.csdn.net/hsuxu/article/details/8985931

    多线程技术主要解决处理器单元内多个线程执行的问题，它可以显著减少处理器单元的闲置时间，增加处理器单元的吞吐能力。
    假设一个服务器完成一项任务所需时间为：T1 创建线程时间，T2 在线程中执行任务的时间，T3 销毁线程时间。

    如果：T1 + T3 远大于 T2，则可以采用线程池，以提高服务器性能。
                一个线程池包括以下四个基本组成部分：
                1、线程池管理器（ThreadPool）：用于创建并管理线程池，包括 创建线程池，销毁线程池，添加新任务；
                2、工作线程（PoolWorker）：线程池中线程，在没有任务时处于等待状态，可以循环的执行任务；
                3、任务接口（Task）：每个任务必须实现的接口，以供工作线程调度任务的执行，它主要规定了任务的入口，任务执行完后的收尾工作，任务的执行状态等；
                4、任务队列（taskQueue）：用于存放没有处理的任务。提供一种缓冲机制。


    各种线程池的区别
    https://www.cnblogs.com/aaron911/p/6213808.html
    newCachedThreadPool、newFixedThreadPool、newSingleThreadExecutor、newScheduleThreadPool





    */
}
