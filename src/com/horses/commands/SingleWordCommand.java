package com.horses.commands;

/**
 * Created by asolod on 3/8/15.
 */
public class SingleWordCommand extends AbstractCommand {

    protected String commandTemplate;

    public SingleWordCommand(String commandTampplate, ICommandExecutor commandExecutor) {
        this.commandTemplate = commandTampplate;
        this.commandExecutor = commandExecutor;
    }

    @Override
    public boolean isValid(String commandInput) {
        return commandTemplate.equalsIgnoreCase(commandInput);
    }
}
