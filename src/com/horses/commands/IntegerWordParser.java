package com.horses.commands;

import java.util.Map;

/**
 * Created by asolod on 3/10/15.
 */
public class IntegerWordParser extends AbstractWordParser {

    public IntegerWordParser(String parameterName) {
        this.parameterName = parameterName;
    }

    @Override
    public boolean parse(Map<String, Object> parameters, String word) {
        if (!super.parse(parameters, word)) {
            return false;
        }

        int value = Integer.parseInt(word);
        parameters.put(this.getParameterName(), value);
        return true;

    }
}
