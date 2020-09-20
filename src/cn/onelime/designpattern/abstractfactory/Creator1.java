package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB1();
    }
}
