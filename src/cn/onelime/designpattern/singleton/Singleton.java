package cn.onelime.designpattern.singleton;

/**
 * 单例模式
 * 饿汉式,上来就给
 *
 * @author zhangqi
 * @date 2020/9/14
 */
public class Singleton {
    private static final Singleton SINGLETON_ONE = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return SINGLETON_ONE;
    }

}
