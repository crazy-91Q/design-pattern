# design-pattern
设计模式

## 单例模式（Singleton Pattern）
Ensure a class has only one instance, and provider a global point of access to it

优点：
* 减少内存开支
* 减少性能开销
* 避免对资源的多重占用
* 优化和共享资源访问

缺点：
* 扩展困难
* 与单一职责冲突

## 工厂方法模式（Factory Method Pattern）
Define an interface for creating an object，but let subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses.

优点：

缺点：

### 简单工厂模式（Simple Factory Pattern）
也叫静态工厂模式，将工厂类中的方法静态化，虽然比较实用，但是扩展比较困难，不符合开闭原则

## 抽象工厂模式（Abstarct Factory Pattern）
Provide an interface for creating familiar of related or dependent objects without specifying their concrete classes.

优点：
* 封装性，只需要关注工厂类是谁，就可以创建所需要的对象
* 产品族内的约束为非公开状态

缺点：
* 产品族扩展非常困难

使用场景：
* 一个对象族（或是一组没有任何关系的对象）都有相同的约束
