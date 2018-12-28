package com.yunduan.design.pattern.creational.singleton;

/**
 * ThreadLocal单例为每一个线程保留一个单例的副本，在一个线程当中获取的都是单例的
 */
public class ThreadLocalInstance {
    private static ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}
