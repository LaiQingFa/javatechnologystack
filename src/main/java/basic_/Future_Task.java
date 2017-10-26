package basic_;

/**
 * Future接口,常见的线程池中的FutureTask实现等
 */
public class Future_Task {


/*
http://uule.iteye.com/blog/1539084

单独使用Runnable时：
        无法获得返回值

单独使用Callable时：
        无法在新线程中(new Thread(Runnable r))使用，只能使用ExecutorService
        Thread类只支持Runnable

FutureTask：
         实现了Runnable和Future，所以兼顾两者优点
         既可以使用ExecutorService，也可以使用Thread



 Future是一个接口， FutureTask类是Future 的一个实现类，并实现了Runnable，因此FutureTask可以传递到线程对象Thread中新建一个线程执行。所以可通过Excutor(线程池) 来执行,也可传递给Thread对象执行。如果在主线程中需要执行比较耗时的操作时，但又不想阻塞主线程时，可以把这些作业交给Future对象在后台完成，当主线程将来需要时，就可以通过Future对象获得后台作业的计算结果或者执行状态。
FutureTask是为了弥补Thread的不足而设计的，它可以让程序员准确地知道线程什么时候执行完成并获得到线程执行完成后返回的结果（如果有需要）。

FutureTask是一种可以取消的异步的计算任务。它的计算是通过Callable实现的，它等价于可以携带结果的Runnable，并且有三个状态：等待、运行和完成。完成包括所有计算以任意的方式结束，包括正常结束、取消和异常。
Executor框架利用FutureTask来完成异步任务，并可以用来进行任何潜在的耗时的计算。一般FutureTask多用于耗时的计算，主线程可以在完成自己的任务后，再去获取结果。
  FutureTask多用于耗时的计算，主线程可以在完成自己的任务后，再去获取结果。

JDK:
此类提供了对 Future 的基本实现。仅在计算完成时才能检索结果；如果计算尚未完成，则阻塞 get 方法。一旦计算完成，就不能再重新开始或取消计算。

可使用 FutureTask 包装 Callable 或 Runnable 对象。因为 FutureTask 实现了 Runnable，所以可将 FutureTask 提交给 Executor 执行。




*/

}
