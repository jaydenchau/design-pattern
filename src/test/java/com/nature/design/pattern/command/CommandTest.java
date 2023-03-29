package com.nature.design.pattern.command;

import org.junit.Test;

/**
 * @author Jayden Chau
 * @date 2023/2/24 10:43
 */
public class CommandTest {

    @Test
    public void testCommand() {
        LightCommand lightCommand = new LightCommand(new Light());
        FanCommand fanCommand = new FanCommand(new Fan());
        // 添加命令
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(lightCommand);
        remoteControl.addCommand(fanCommand);
        // 执行命令
        remoteControl.execute();

    }
}
