package com.yunduan.design.pattern.creational.abstractfactory;

public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
