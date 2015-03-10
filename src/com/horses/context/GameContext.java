package com.horses.context;

import com.horses.context.utils.ContextUtils;
import com.horses.model.Horse;

import java.util.List;

/**
 * Created by asolod on 3/8/15.
 */
public class GameContext {

    private Horse horseWon;

    private List<Horse> horses;

    private void resetCash() {
        //
    }

    public GameContext() {
        this.horses = ContextUtils.loadHorses();
        this.horseWon = horses.get(0);
    }

    public boolean stopGame() {
        return false;
    }
}
