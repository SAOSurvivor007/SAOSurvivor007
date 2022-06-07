package singleton.test;

import singleton.code.Singleton3;

public class Test3 {
    public static void main(String[] args) {
        Singleton3 s = Singleton3.INSTATCE;
        System.out.println(s);
        System.out.println(s.getInfo());
    }
}
