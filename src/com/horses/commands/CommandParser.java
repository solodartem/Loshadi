package com.horses.commands;

import com.horses.context.GameContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asolod on 3/10/15.
 */
public class CommandParser {

    private ICommandExecutor commandExecutor;
    private Map<String, Object> parameters;
    private AbstractWordParser[] wordsParsers;


    public CommandParser(AbstractWordParser[] wordsParsers, ICommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
        this.wordsParsers = wordsParsers;

    }

    public boolean executeCommand(GameContext gameContext, String commandStr){

        parameters = new HashMap<String, Object>();

        String[] words =  commandStr.split(" ");
        if (words.length != wordsParsers.length) {
            return false;
        }

        for (int i=0; i < words.length; i++) {
            if (!wordsParsers[0].parse(parameters, words[i])) {
                return false;
            }
        }

        commandExecutor.execute(gameContext, parameters);

        return true;
    }



     public static void main(String[] args) {
        new CommandParser(new AbstractWordParser[]{new SingleLetterWordParser("q")}, new ICommandExecutor() {
            @Override
            public boolean execute(GameContext gameContext, Map<String, Object> paremeter) {
                return gameContext.stopGame();
            }
        });
    }
}
