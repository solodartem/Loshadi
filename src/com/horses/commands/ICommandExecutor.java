package com.horses.commands;

import com.horses.context.GameContext;

import java.util.Map;

/**
 * Created by asolod on 3/10/15.
 */
public interface ICommandExecutor {

    public boolean execute(GameContext gameContext, Map<String, Object> paremeter);
}
