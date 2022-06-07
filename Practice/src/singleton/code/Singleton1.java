package singleton.code;

/**
 * 饿汉式：直接创建实例对象
 *  （1）构造器私有化
 *  （2）自行创建，用公开静态常量保存
 *  （3）向外提供这个实例
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
}
