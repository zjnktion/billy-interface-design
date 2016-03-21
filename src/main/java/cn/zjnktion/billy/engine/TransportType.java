package cn.zjnktion.billy.engine;

/**
 * 传输类型
 * Created by zhengjn on 2016/3/21.
 */
public class TransportType {

    public static final String OIO_NAME = "Oio";
    public static final String NIO_NAME = "nio";
    public static final String ARP_NAME = "arp";

    public static final TransportType OIO = new TransportType(OIO_NAME);
    public static final TransportType NIO = new TransportType(NIO_NAME);
    public static final TransportType ARP = new TransportType(ARP_NAME);

    private String name;

    private TransportType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
