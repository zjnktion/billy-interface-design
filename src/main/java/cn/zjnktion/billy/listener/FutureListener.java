package cn.zjnktion.billy.listener;

import cn.zjnktion.billy.future.Future;

import java.util.EventListener;

/**
 * {@link Future} 事件监听器
 * Created by zhengjn on 2016/3/18.
 */
public interface FutureListener<F extends Future> extends EventListener {

    FutureListener<Future> CLOSE = new FutureListener<Future>() {
        public void operationComplete(Future future) {

        }
    };

    /**
     * 当你在某个 {@link Future} 内添加监听器之后，该 {@link Future} 相应的操作完成之后这个方法会被触发
     * @param future
     */
    void operationComplete(F future);

}
