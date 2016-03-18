package cn.zjnktion.billy.filter;

/**
 * Created by zhengjn on 2016/3/18.
 */
public interface FilterChainBuilder {

    /**
     * 创建责任链
     * @param filterChain
     * @throws Exception
     */
    void buildFilterChain(FilterChain filterChain) throws Exception;

}
