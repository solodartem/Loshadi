package com.horses.commands;

import com.horses.context.GameContext;

/**
 * Created by asolod on 3/8/15.
 */
public abstract class AbstractCommand {

    protected ICommandExecutor commandExecutor;

    public boolean isValid(String commandInput) {
        return false;
    }

    public boolean executeCommand(GameContext gameContext){
        return commandExecutor.executeCommand(gameContext);
    }
}
