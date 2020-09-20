package cn.onelime.designpattern.factorymethod;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public abstract class Creator {
    /**
     * 创建产品对象
     * 入参通常为String，Enum，Class等
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
