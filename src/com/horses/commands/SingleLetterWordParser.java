package com.horses.commands;

/**
 * Created by asolod on 3/10/15.
 */
public class SingleLetterWordParser extends  AbstractWordParser {

    private String wordPattern;

    public SingleLetterWordParser(String wordPattern) {
        this.wordPattern = wordPattern;
    }

    @Override
    public boolean parse(String word) {
        if (!super.parse(word)){
            return false;
        }
        return word.equalsIgnoreCase(wordPattern);
    }
}
