package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName());
    }

    public ProductA1() {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}
