package cn.zjnktion.billy.future;

import cn.zjnktion.billy.context.Context;
import cn.zjnktion.billy.listener.FutureListener;

import java.util.concurrent.TimeUnit;

/**
 * billy产生的各种Future
 * Created by zhengjn on 2016/3/18.
 */
public interface Future {

    /**
     * 获取这个future的关联 {@link Context}
     * @return
     */
    Context getContext();

    /**
     * 为这个future的结束添加一个 {@link FutureListener} 事件监听器
     * 当future完成之后，该事件会被唤醒
     * @param listener
     * @return
     */
    Future addListener(FutureListener<?> listener);

    /**
     * 删除事件监听器
     * @param listener
     * @return
     */
    Future removeListener(FutureListener<?> listener);

    /**
     * 等待一个异步执行结束
     * @return
     * @throws InterruptedException
     */
    Future await() throws InterruptedException;

    /**
     * 在规定的时间内等待一个异步执行结束
     * 超时则中断
     * @param timeout
     * @param timeUnit
     * @return
     * @throws InterruptedException
     */
    boolean await(long timeout, TimeUnit timeUnit) throws InterruptedException;

    /**
     * 等待一个异步执行结束，这是一个不可以被中断的操作
     * @return
     */
    Future awaitUninterruptibly();

    /**
     * 等待一个异步执行结束
     * 超时则返回false
     * @param timeout
     * @param timeUnit
     * @return
     */
    boolean awaitUninterruptibly(long timeout, TimeUnit timeUnit);

    boolean isDone();

}
