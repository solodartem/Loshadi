package com.horses.commands;

/**
 * Created by asolod on 3/10/15.
 */
public abstract  class AbstractWordParser {

    protected String parameterName;

    public String getParameterName() {
        return parameterName;
    };

    public boolean parse(String word) {
        return word!=null||word.length()==1;
    }

}
