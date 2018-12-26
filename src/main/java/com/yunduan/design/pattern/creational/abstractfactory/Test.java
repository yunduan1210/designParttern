package com.yunduan.design.pattern.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArtical();
        video.produce();
        article.produce();
    }
}
