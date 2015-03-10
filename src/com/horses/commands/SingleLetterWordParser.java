package com.horses.commands;

import java.util.Map;

/**
 * Created by asolod on 3/10/15.
 */
public class SingleLetterWordParser extends  AbstractWordParser {

    private String wordPattern;

    public SingleLetterWordParser(String wordPattern) {
        this.wordPattern = wordPattern;
    }

    @Override
    public boolean parse(Map<String, Object> paremeters, String word) {
        if (!super.parse(paremeters, word)){
            return false;
        }
        return word.equalsIgnoreCase(wordPattern);
    }
}
