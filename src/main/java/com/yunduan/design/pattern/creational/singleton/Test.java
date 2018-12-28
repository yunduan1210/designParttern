package com.yunduan.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//        //序列化
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"));
//        oos.writeObject(instance);
//
//        File file = new File("file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        HungrySingleton instance = HungrySingleton.getInstance();
//        constructor.setAccessible(true);
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        //不是加载的反射
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        LazySingleton instance = LazySingleton.getInstance();
//        constructor.setAccessible(true);
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        /**
         * ThreadLocal单例
         */
//        System.out.println(ThreadLocalInstance.getInstance());
//        System.out.println(ThreadLocalInstance.getInstance());
//        System.out.println(ThreadLocalInstance.getInstance());
//        System.out.println(ThreadLocalInstance.getInstance());
//
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        Thread t3 = new Thread(){
//            @Override
//            public void run() {
//                System.out.println(ThreadLocalInstance.getInstance());
//                System.out.println(ThreadLocalInstance.getInstance());
//            }
//        };
//        t3.start();
//        t1.start();
//        t2.start();


    }
}
