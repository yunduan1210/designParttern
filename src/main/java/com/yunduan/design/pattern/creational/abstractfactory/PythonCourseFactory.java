package com.yunduan.design.pattern.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArtical() {
        return new PythonArticle();
    }
}
