package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName());
    }

    public ProductB1() {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}
