package com.yunduan.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//延迟加载，线程不安全,需要加上同步锁
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton(){
        if(flag){
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //反射攻击  无法防范
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySingleton o1 = LazySingleton.getInstance();

        Class lazySingletonClass = LazySingleton.class;
        Constructor c = lazySingletonClass.getDeclaredConstructor();
        Field field = o1.getClass().getDeclaredField("flag");
        field.setAccessible(true);
        field.set(o1,true);
        c.setAccessible(true);

        LazySingleton o2 = (LazySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }
}
