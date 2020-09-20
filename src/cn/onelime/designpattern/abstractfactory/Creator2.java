package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB2();
    }
}
