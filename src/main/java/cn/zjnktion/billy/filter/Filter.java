package cn.zjnktion.billy.filter;

import cn.zjnktion.billy.context.Context;
import cn.zjnktion.billy.handler.Handler;

/**
 * 用来拦截事件的filter
 * 就像servlet的filter一样
 * Created by zhengjn on 2016/3/18.
 */
public interface Filter {

    //对filter自身事件的拦截
    /**
     * filter初始化
     * @throws Exception
     */
    void init() throws Exception;

    /**
     * filter销毁
     * @throws Exception
     */
    void destroy() throws Exception;

    /**
     * filter被加到某个 {@link FilterChain} 之前
     * @param parentContainer
     * @param name
     * @param nextFilter
     * @throws Exception
     */
    void preAdd(FilterChain parentContainer, String name, NextFilter nextFilter) throws Exception;

    /**
     * filter被加到某个 {@link FilterChain} 之后
     * @param parentContainer
     * @param name
     * @param nextFilter
     * @throws Exception
     */
    void postAdd(FilterChain parentContainer, String name, NextFilter nextFilter) throws Exception;

    /**
     * filter从某个 {@link FilterChain} 中删除之前
     * @param filterChain
     * @param name
     * @param nextFilter
     * @throws Exception
     */
    void preRemove(FilterChain filterChain, String name, NextFilter nextFilter) throws Exception;

    /**
     * filter从某个 {@link FilterChain} 中删除之后
     * @param filterChain
     * @param name
     * @param nextFilter
     * @throws Exception
     */
    void postRemove(FilterChain filterChain, String name, NextFilter nextFilter) throws Exception;

    //对业务处理器handler事件的拦截
    /**
     * 拦截 {@link Handler#contextCreated(Context)} 事件
     * @param context
     * @param nextFilter
     * @throws Exception
     */
    void contextCreated(Context context, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#contextOpened(Context)} 事件
     * @param context
     * @param nextFilter
     * @throws Exception
     */
    void contextOpened(Context context, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#contextClosed(Context)} 事件
     * @param context
     * @param nextFilter
     * @throws Exception
     */
    void contextClosed(Context context, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#contextIdle(Context)} 事件
     * @param context
     * @param nextFilter
     * @throws Exception
     */
    void contextIdle(Context context, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#contextRead(Context, Object)} 事件
     * @param context
     * @param msg
     * @param nextFilter
     * @throws Exception
     */
    void contextRead(Context context, Object msg, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#contextWrote(Context, Object)} 事件
     * @param context
     * @param msg
     * @param nextFilter
     * @throws Exception
     */
    void contextWrote(Context context, Object msg, NextFilter nextFilter) throws Exception;

    /**
     * 拦截 {@link Handler#exceptionCaught(Context, Throwable)} 事件
     * @param context
     * @param cause
     * @param nextFilter
     * @throws Exception
     */
    void exceptionCaught(Context context, Throwable cause, NextFilter nextFilter) throws Exception;

    // 对context事件的拦截

    /**
     * 下一个filter
     * 主要是将业务处理器handler的事件以及context的事件从上一个filter传给这个filter来做拦截
     * 基于责任链的一种设计
     */
    interface NextFilter {

        void contextCreated(Context context);

        void contextOpened(Context context);

        void contextClosed(Context context);

        void contextIdle(Context context);

        void exceptionCaught(Context context, Throwable cause);

        void contextRead(Context context, Object msg);

        void contextWrote(Context context, Object msg);

        // TODO: 2016/3/18 还需要添加对context事件的拦截

    }

}
