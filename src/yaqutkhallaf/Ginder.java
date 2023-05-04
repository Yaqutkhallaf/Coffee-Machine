/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaqutkhallaf;

/**
 *
 * @author student
 */
public class Ginder {

    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public Ginder(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Ginder{" + "level=" + level + '}';
    }

    public void grind() {

    }

}
