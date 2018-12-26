package com.yunduan.design.pattern.creational.factorymethod;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.printf("录制java视频");
    }
}
