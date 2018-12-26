package com.yunduan.design.pattern.creational.abstractfactory;

public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("录制python手记");
    }
}
