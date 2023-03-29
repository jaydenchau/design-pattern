package com.nature.design.pattern.factory.abs;

/**
 * @author nature
 * @date 2020/10/23 14:43
 */
public class PythonFactory implements CourseFactory {

    private PythonOperation pythonOperation = new PythonOperation();

    @Override
    public void getVideo() {
        pythonOperation.producePythonVideo();
    }

    @Override
    public void getNotes() {
        pythonOperation.writePythonNot();
    }
}
