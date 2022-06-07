package singleton.test;

import singleton.code.Singleton1;

public class Test1 {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.INSTANCE;
        System.out.println(s);
    }
}
