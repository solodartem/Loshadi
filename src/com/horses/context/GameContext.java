package com.horses.context;

import com.horses.commands.AbstractCommand;
import com.horses.commands.ICommandExecutor;
import com.horses.commands.SingleWordCommand;
import com.horses.context.utils.ContextUtils;
import com.horses.model.Horse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asolod on 3/8/15.
 */
public class GameContext {

    private Horse horseWon;

    private List<Horse> horses;

    private List<AbstractCommand> commands = new LinkedList<AbstractCommand>() {{

        add(new SingleWordCommand("r", new ICommandExecutor() {

            @Override
            public boolean executeCommand(GameContext gameContext) {
                gameContext.resetCash();
                return true;
            }
        }));
    }};

    private void resetCash() {
        //
    }

    public GameContext() {
        this.horses = ContextUtils.loadHorses();
        this.horseWon = horses.get(0);
    }
}
