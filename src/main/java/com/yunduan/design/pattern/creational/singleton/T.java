package com.yunduan.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);

//        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}
