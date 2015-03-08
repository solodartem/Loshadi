package com.horses.commands;

import com.horses.context.GameContext;

/**
 * Created by asolod on 3/8/15.
 */
public interface ICommandExecutor {

    public boolean executeCommand(GameContext gameContext);
}
