package cn.zjnktion.billy.context;

import cn.zjnktion.billy.engine.Engine;
import cn.zjnktion.billy.filter.FilterChain;
import cn.zjnktion.billy.future.CloseFuture;
import cn.zjnktion.billy.future.ReadFuture;
import cn.zjnktion.billy.future.WriteFuture;
import cn.zjnktion.billy.handler.Handler;

/**
 * 用来表示连接两端之间通道的一个上下文，根据不同的连接类型有不同的上下文类型。
 * Created by zhengjn on 2016/3/18.
 */
public interface Context {

    /**
     * 获取context的id
     * @return
     */
    long getId();

    /**
     * 获取为这个context提供服务的billy引擎
     * @return
     */
    Engine getEngine();

    /**
     * 获取这个context的业务处理器（其实是engine全局共享的）
     * @return
     */
    Handler getHandler();

    /**
     * 获取拦截这个context所有事件的责任链
     * @return
     */
    FilterChain getFilterChain();

    /**
     * 获取绑定在该context上的属性
     * @param key
     * @return
     */
    Object getAttribute(Object key);

    /**
     * 设置该context上绑定的某个属性
     * 返回该属性的旧值，如果原来没有设置过，则返回null
     * @param key
     * @param value
     * @return
     */
    Object setAttribute(Object key, Object value);

    /**
     * context上是否绑定了某个属性
     * @param key
     * @return
     */
    boolean containsAttribute(Object key);

    ReadFuture read();

    WriteFuture write(Object msg);

    CloseFuture close();

    CloseFuture closeImmediately();

}
