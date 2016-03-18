package cn.zjnktion.billy.core.listener;

import cn.zjnktion.billy.core.engine.Engine;

/**
 * {@link cn.zjnktion.billy.core.engine.Engine} 事件监听器
 * Created by zhengjn on 2016/3/18.
 */
public interface EngineListener {

    void engineActivated(Engine engine);

    void engineIdle(Engine engine);

    void engineDeactivated(Engine engine);

}
