package cn.zjnktion.billy.handler;

import cn.zjnktion.billy.context.Context;

/**
 * 处理由billy驱动的所有事件。
 * Created by zhengjn on 2016/3/18.
 */
public interface Handler {

    /**
     * 创建上下文
     * @param context
     */
    void contextCreated(Context context) throws Exception;

    /**
     * 打开上下文
     * @param context
     */
    void contextOpened(Context context) throws Exception;

    /**
     * 关闭上下文
     * @param context
     */
    void contextClosed(Context context) throws Exception;

    /**
     * 上下文超时
     * @param context
     */
    void contextIdle(Context context) throws Exception;

    /**
     * 当接收到一个消息的时候被调用
     * @param context
     * @param msg
     */
    void contextRead(Context context, Object msg) throws Exception;

    /**
     * 当一个写请求正式被发送出去的时候被调用
     * @param context
     * @param msg
     */
    void contextWrote(Context context, Object msg) throws Exception;

    /**
     * 捕获到异常
     * @param context
     */
    void exceptionCaught(Context context, Throwable cause) throws Exception;

}
