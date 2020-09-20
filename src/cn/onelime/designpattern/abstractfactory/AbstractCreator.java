package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public abstract class AbstractCreator {
    /**
     * 创建A系列产品
     *
     * @return
     */
    public abstract AbstractProductA createAbstractProductA();

    /**
     * 创建B系列产品
     *
     * @return
     */
    public abstract AbstractProductB createAbstractProductB();
}
