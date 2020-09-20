package cn.onelime.designpattern.factorymethod;

/**
 * @author zhangqi
 * @date 2020/9/20
 */
public class Client {
    public static void main(String[] args) {
        Creator creator=new ConcreteCreator();
        creator.createProduct(ConcreteProduct1.class);
    }
}
