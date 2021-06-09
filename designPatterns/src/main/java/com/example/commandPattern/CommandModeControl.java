package com.example.commandPattern;

import com.example.commandPattern.device.Control;

import java.util.Stack;

/**
 * @ClassName : CommandModeControl
 * @Description :
 * @Version V1.0
 */
public class CommandModeControl implements Control {
    private Command[] onCommands;
    private Command[] offCommands;
    // 栈对象存储执行的命令
    private Stack<Command> stack=new Stack<Command>();

    public CommandModeControl()
    {
        onCommands=new Command[5];
        offCommands=new Command[5];

        Command noCommand=new NoCommand();

        for(int i=0,len=onCommands.length;i<len;i++)
        {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }

    }

    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    @Override
    public void onButton(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    @Override
    public void offButton(int slot) {
        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    @Override
    public void undoButton() {
        stack.pop().undo();
    }
}
