package cn.zjnktion.billy.listener;

import cn.zjnktion.billy.engine.Engine;

/**
 * {@link Engine} 事件监听器
 * Created by zhengjn on 2016/3/18.
 */
public interface EngineListener {

    void engineActivated(Engine engine);

    void engineIdle(Engine engine);

    void engineDeactivated(Engine engine);

}
