package com.example.commandPattern;

import com.example.commandPattern.device.Light;

/**
 * @ClassName : MainTest
 * @Version V1.0
 */
public class MainTest {

    public static  void main(String[] args){
        CommandModeControl commandModeControl = new CommandModeControl();
        Light bedlight = new Light("bedRoom");
        Light kitchlight = new Light("Kitch");

        LightOnCommand bedlightOnCommand = new LightOnCommand(bedlight);
        LightOffCommand bedlightOffCommand = new LightOffCommand(bedlight);
        LightOnCommand kitchlightOnCommand = new LightOnCommand(kitchlight);
        LightOffCommand kitchlightOffCommand = new LightOffCommand(kitchlight);

        commandModeControl.setCommand(1,bedlightOnCommand, bedlightOffCommand);
        commandModeControl.setCommand(2,kitchlightOnCommand, kitchlightOffCommand);

        commandModeControl.onButton(1);
        commandModeControl.offButton(1);
        commandModeControl.undoButton();//回退所有操作命令
        commandModeControl.onButton(2);
        commandModeControl.offButton(2);
        commandModeControl.undoButton();//回退所有操作命令

        // 一次性操作所有电器开关
        /*MarcoCommand marcommandON, marcommandOFF;
        Command[] commandON = {bedlightOnCommand,kitchlightOnCommand};
        Command[] commandOFF = {bedlightOffCommand,kitchlightOffCommand};
        marcommandON = new MarcoCommand(commandON);
        marcommandOFF =new MarcoCommand(commandOFF);

        marcommandON.execute();
        marcommandOFF.execute();


        //回退所有操作命令
        marcommandOFF.undo();*/
    }
}
