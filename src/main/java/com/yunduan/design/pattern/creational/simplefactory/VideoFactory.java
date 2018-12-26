package com.yunduan.design.pattern.creational.simplefactory;

public class VideoFactory {

    public Video getVideo(String type){
        if("java".equals(type)){
            return new JavaVideo();
        }else if("python".equals(type)){
            return new PythonVideo();
        }else {
            return null;
        }
    }

    //利用反射加强
    public Video getVideo1(Class c){
        Video video = null;
        try{
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return video;
    }
}
