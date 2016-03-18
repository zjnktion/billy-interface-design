package cn.zjnktion.billy.event;

/**
 * 由billy提供的一个基于I/O事件或者I/O请求的事件类
 * Created by zhengjn on 2016/3/18.
 */
public class Event implements Runnable {

    public void run() {
        fire();
    }

    public void fire() {

    }
}
