package Pattern.singleton;

import Pattern.singleton.lazy.LazySingleton;

public class Run implements Runnable{
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
