package singleton.code;

/**
 * 懒汉式：延迟创建实例对象（用到时再创建）
 * （1）构造器私有化
 * （2）内部类被加载和初始化时创建对象
 * （3）静态内部类需要单独加载和初始化，与外部类无关
 * （4）线程安全
 */
public class Singleton5 {
    private Singleton5(){
    }

    private static class Inner{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return Inner.INSTANCE;
    }
}
