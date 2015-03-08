/**
 * Created by asolod on 3/8/15.
 */

package com.horses.model;

public class Horse {

    private String name;
    private int odd;

    public Horse(String name, int odd) {
        this.name = name;
        this.odd = odd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOdd() {
        return odd;
    }

    public void setOdd(int odd) {
        this.odd = odd;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", odd='" + odd + '\'' +
                '}';
    }
}
