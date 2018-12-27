package com.yunduan.design.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    //InnerClass初始化对象锁
    private StaticInnerClassSingleton(){

    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
