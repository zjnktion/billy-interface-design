package cn.zjnktion.billy.core.engine;

import cn.zjnktion.billy.core.handler.Handler;
import cn.zjnktion.billy.core.listener.EngineListener;

/**
 * I/O服务的基础接口
 * Created by zhengjn on 2016/3/18.
 */
public interface Engine {

    /**
     * 添加事件监听器
     * @param listener
     */
    void addListener(EngineListener listener);

    /**
     * 删除事件监听器
     * @param listener
     */
    void removeListener(EngineListener listener);

    /**
     * 获取当前引擎管理的所有连接对应的业务处理器
     * @return
     */
    Handler getHandler();

    /**
     * 设置当前引擎管理的所有连接对应的业务处理器
     * @param handler
     */
    void setHandler(Handler handler);

    /**
     * 是否工作
     * @return
     */
    boolean isActive();

    /**
     * 是否正在关闭
     * @return
     */
    boolean isShuttingdown();

    /**
     * 是否关闭完成
     * @return
     */
    boolean isSshutdown();

    /**
     * 关闭
     */
    void shutdown();
}
