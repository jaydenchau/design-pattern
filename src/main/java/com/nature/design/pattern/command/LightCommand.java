package com.nature.design.pattern.command;

/**
 * @author Jayden Chau
 * @date 2023/2/24 10:38
 */
public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.turnOn();
    }

    @Override
    public void turnOff() {
        light.turnOff();
    }
}
