package singleton.test;

import singleton.code.Singleton2;

public class Test2 {
    public static void main(String[] args) {
        Singleton2 s = Singleton2.INSTANCE;
        System.out.println(s);
    }
}
