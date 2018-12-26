package com.yunduan.design.pattern.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArtical() {
        return new JavaArticle();
    }
}
