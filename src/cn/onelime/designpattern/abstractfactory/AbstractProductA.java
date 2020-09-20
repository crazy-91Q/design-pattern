package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public abstract class AbstractProductA {
    /**
     * 每个产品的公共方法
     */
    public void method1() {
    }

    /**
     * 每个产品相同方法不同实现
     */
    public abstract void doSomething();
}
