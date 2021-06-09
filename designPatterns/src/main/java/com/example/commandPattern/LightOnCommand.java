package com.example.commandPattern;

import com.example.commandPattern.device.Light;

/**
 * @ClassName : LightOnCommand
 * @Description :
 * @Version V1.0
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light)
    {
        this.light=light;

    }
    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
}
