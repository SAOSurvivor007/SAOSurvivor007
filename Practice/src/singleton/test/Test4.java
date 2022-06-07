package singleton.test;

import singleton.code.Singleton4;

import java.util.concurrent.*;

public class Test4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton4> callable = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = executorService.submit(callable);
        Future<Singleton4> f2 = executorService.submit(callable);

        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

        executorService.shutdown();
    }
}
