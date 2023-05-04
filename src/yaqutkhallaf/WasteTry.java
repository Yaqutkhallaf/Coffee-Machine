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
public class WasteTry {

    private int capacity;
    private int level;

    public WasteTry(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "WasteTry{" + "capacity=" + capacity + ", level=" + level + '}';
    }

    public void clean() {

    }

}
