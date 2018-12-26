package com.yunduan.design.pattern.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
        //应用层依赖JavaVideo这个类
//        Video video = new JavaVideo();
//        video.produce();

        //扩展，不符合开闭原则
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();

        //利于扩展
        VideoFactory videoFactory = new VideoFactory();
        Video video1 = factory.getVideo1(JavaVideo.class);
        if(video1 == null){
            return;
        }
        video1.produce();
    }
}
