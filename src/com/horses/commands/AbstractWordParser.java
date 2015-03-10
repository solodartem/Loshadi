package com.horses.commands;

import java.util.Map;

/**
 * Created by asolod on 3/10/15.
 */
public abstract  class AbstractWordParser {

    protected String parameterName;

    public boolean parse(Map<String, Object> parameters, String word) {
        return word!=null||word.length()==1;
    }

}
