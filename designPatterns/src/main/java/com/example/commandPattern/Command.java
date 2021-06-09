package com.example.commandPattern;

/**
 * @ClassName : Command
 * @Description :
 * @Version V1.0
 */
public interface Command {
    // 执行
    public void execute();
    // 回退
    public void undo();
}
