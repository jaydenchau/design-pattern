package com.nature.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jayden Chau
 * @date 2023/2/24 10:40
 */
public class RemoteControl {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    public void execute() {
        for (Command command : commandList) {
            command.turnOn();
        }
    }
}
