package cn.zjnktion.billy.engine;

import cn.zjnktion.billy.filter.DefaultFilterChainFilter;
import cn.zjnktion.billy.filter.FilterChainBuilder;
import cn.zjnktion.billy.handler.Handler;
import cn.zjnktion.billy.listener.EngineListener;

/**
 * I/O服务的基础接口
 * Created by zhengjn on 2016/3/18.
 */
public interface Engine {

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
    boolean isShutteddown();

    /**
     * 关闭
     */
    void shutdown();

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
     * 返回引擎当前指定的责任链构建器
     * @return
     */
    FilterChainBuilder getFilterChainBuilder();

    /**
     * 设置引擎当前责任链构建器
     * @param builder
     */
    void setFilterChainBuilder(FilterChainBuilder builder);

    /**
     * 获取引擎当前默认的责任链构建器
     * @return
     */
    DefaultFilterChainFilter getFilterChain();

}
