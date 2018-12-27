package com.yunduan.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式").buildCoursePPT("java设计模式PPT")
                .buildCourseVideo("java设计模式视频").build();
        System.out.println(course);
    }
}
