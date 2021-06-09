package com.example.commandPattern;

import com.example.commandPattern.device.Stereo;

/**
 * @ClassName : StereoOffCommand
 * @Description :
 * @Version V1.0
 */
public class StereoOffCommand implements  Command{
    private Stereo setreo;
    public StereoOffCommand(Stereo setreo)
    {
        this.setreo=setreo;
    }

    @Override
    public void execute() {
        setreo.Off();
    }

    @Override
    public void undo() {
        setreo.On();
        setreo.SetCd();
    }
}
