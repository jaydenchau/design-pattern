package com.nature.design.pattern.factory.abs;

/**
 * @author nature
 * @date 2020/10/23 14:43
 */
public class JavaFactory implements CourseFactory {

    private JavaOperation javaOperation = new JavaOperation();

    @Override
    public void getVideo() {
        javaOperation.produceJavaVideo();
    }

    @Override
    public void getNotes() {
        javaOperation.writeJavaNot();
    }
}
