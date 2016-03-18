package cn.zjnktion.billy.core.handler;

import cn.zjnktion.billy.core.context.Context;

/**
 * 处理由billy驱动的所有事件。
 * Created by zhengjn on 2016/3/18.
 */
public interface Handler {

    /**
     * 创建上下文
     * @param context
     */
    void contextCreated(Context context);

    /**
     * 打开上下文
     * @param context
     */
    void cotnextOpened(Context context);

    /**
     * 关闭上下文
     * @param context
     */
    void contextClosed(Context context);

    /**
     * 上下文超时
     * @param context
     */
    void contextIdle(Context context);

    /**
     * 捕获到异常
     * @param context
     */
    void exceptionCaught(Context context, Throwable cause);

    /**
     * 读
     * @param context
     * @param msg
     */
    void contextRead(Context context, Object msg);

    /**
     * 写
     * @param context
     * @param msg
     */
    void contextWrote(Context context, Object msg);

}
