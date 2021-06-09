package com.example.commandPattern.device;

/**
 * @ClassName : Control
 * @Description : 遥控器
 * @Version V1.0
 */
public interface Control {
    public void onButton(int slot);

    public void offButton(int slot);

    public void undoButton();
}
