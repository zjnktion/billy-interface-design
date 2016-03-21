package cn.zjnktion.billy.engine;

import cn.zjnktion.billy.context.ContextConfig;

import java.net.SocketAddress;

/**
 * 描述 {@link Engine} 的元信息
 * Created by zjnktion on 2016/3/18.
 */
public interface EngineMetainfo {

    /**
     * 返回引擎名称
     * @return
     */
    String getEngineName();

    /**
     * 返回通讯类型（例如： "nio", "oio", "arp" 和 "aio" 等）
     * @return
     */
    TransportType getTransportType();

    /**
     * 判断引擎底层链路是否有断包数据（是否需要粘包处理）
     * @return
     */
    boolean hasFragmentation();

    /**
     * 返回SocketAddress的类型
     * @return
     */
    Class<? extends SocketAddress> getSocketAddressClazz();

    Class<? extends ContextConfig> getContextConfigClazz();

}
