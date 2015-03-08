package com.horses.context.utils;

import com.horses.model.Horse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asolod on 3/8/15.
 */
public class ContextUtils {


    public static List<Horse> loadHorses() {

        return new LinkedList<Horse>(){{
            add(new Horse("Horse1", 10));
            add(new Horse("Horse2", 4));
        }};

    }
}
