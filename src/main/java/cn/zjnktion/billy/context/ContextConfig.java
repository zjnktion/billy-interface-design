package cn.zjnktion.billy.context;

import java.util.concurrent.TimeUnit;

/**
 * 每一个具体的 {@link cn.zjnktion.billy.engine.Engine} 唯一全局 {@link ContextConfig}
 * Created by zjnktion on 2016/3/18.
 */
public interface ContextConfig {

    /**
     * 获取读缓冲区默认长度
     * @return
     */
    int getReadBufferSize();

    /**
     * 设置读缓冲区默认长度
     * @param size
     */
    void setReadBufferSize(int size);

    /**
     * 获取读缓冲区最小长度
     * @return
     */
    int getMinReadBufferSize();

    /**
     * 设置读缓冲区最小长度
     * @param size
     */
    void setMinReadBufferSize(int size);

    /**
     * 获取读缓冲区最大长度
     * @return
     */
    int getMaxReadBufferSize();

    /**
     * 设置读缓冲区最大长度
     * @param size
     */
    void setMaxReadBufferSize(int size);

    /**
     * 根据超时类型获取超时时间
     * @param idleType
     * @param timeUnit
     * @return
     */
    long getIdleTime(IdleType idleType, TimeUnit timeUnit);

    /**
     * 根据超时类型设置超时时间
     * @param idleType
     * @param timeUnit
     */
    void setIdleTime(IdleType idleType, TimeUnit timeUnit);

    /**
     * 设置配置
     * @param config
     */
    void setConfig(ContextConfig config);

}
