package com.nature.design.pattern.command;

/**
 * @author Jayden Chau
 * @date 2023/2/24 10:39
 */
public class FanCommand implements Command {

    private Fan fan;

    public FanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnOn() {
        fan.turnOn();
    }

    @Override
    public void turnOff() {
        fan.turnOff();
    }
}
