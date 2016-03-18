package cn.zjnktion.billy.context;

/**
 * 超时类型
 * Created by zjnktion on 2016/3/18.
 */
public class IdleType {

    /**
     * 读超时字常量
     */
    public static final String READ_IDLE_NAME = "read idle";
    /**
     * 写超时字常量
     */
    public static final String WRITE_IDLE_NAME = "write idle";
    /**
     * 读写均超时字常量
     */
    public static final String BOTH_IDLE_NAME = "both idle";

    /**
     * 代表 {@link Context} 没有读取到远端的数据
     */
    public static final IdleType READ_IDLE = new IdleType(READ_IDLE_NAME);
    /**
     * 代表 {@link Context} 没有写数据
     */
    public static final IdleType WRITE_IDLE = new IdleType(WRITE_IDLE_NAME);
    /**
     * 代表 {@link #READ_IDLE} 和 {@link #WRITE_IDLE}
     */
    public static final IdleType BOTH_IDLE = new IdleType(BOTH_IDLE_NAME);

    private final String type;

    private IdleType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

}
