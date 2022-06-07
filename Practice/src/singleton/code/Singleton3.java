package singleton.code;

import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式：直接创建实例对象
 * 在静态代码块中实例化，可以通过有参构造进行复杂的实例化
 */
public class Singleton3 {
    public static final Singleton3 INSTATCE;
    private String info = "default";

    static{
        Properties pro = new Properties();
        try {
             pro.load(Singleton3.class.getClassLoader().getResourceAsStream("singleton.properties"));
            INSTATCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }

}
