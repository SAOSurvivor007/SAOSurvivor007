package singleton.code;

/**
 * 懒汉式：延迟创建实例对象（用到时再创建）
 * （1）构造器私有化
 * （2）用一个静态变量保存唯一实例
 * （3）提供一个静态方法获取该实例
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){
    }

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance==null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
