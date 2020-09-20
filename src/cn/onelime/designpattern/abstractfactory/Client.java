package cn.onelime.designpattern.abstractfactory;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        creator1.createAbstractProductA();
        creator2.createAbstractProductA();
        creator1.createAbstractProductB();
        creator2.createAbstractProductB();
    }
}
