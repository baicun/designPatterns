package com.example.commandPattern;

import com.example.commandPattern.device.Light;

/**
 * @ClassName : LightOffCommand
 * @Description :
 * @Version V1.0
 */
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light)
    {
        this.light=light;
    }
    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}
